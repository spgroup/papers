import pandas as pd
from scipy.stats import ttest_rel, shapiro, wilcoxon
import matplotlib.pyplot as plt
from matplotlib.backends.backend_pdf import PdfPages
import io
import sys

# Redireciona stdout para capturar a saída do script
buffer = io.StringIO()
sys.stdout = buffer

# Lê o CSV de entrada
df = pd.read_csv("merged_results.csv", delimiter=';')

# Garante que os valores são numéricos
df["ioa_mean"] = pd.to_numeric(df["ioa_mean"], errors='coerce')
df["ioa_without_pa_mean"] = pd.to_numeric(df["ioa_without_pa_mean"], errors='coerce')
df["ioa_std"] = pd.to_numeric(df["ioa_std"], errors='coerce')
df["ioa_without_pa_std"] = pd.to_numeric(df["ioa_without_pa_std"], errors='coerce')

# Remove cenários com valores faltantes
df_clean = df.dropna(subset=["ioa_mean", "ioa_without_pa_mean", "ioa_std", "ioa_without_pa_std"])

# ----------------------------
# Teste de normalidade de Shapiro-Wilk
# ----------------------------
print("\n=== Teste de Normalidade (Shapiro-Wilk) ===")

shapiro_ioa = shapiro(df_clean["ioa_mean"])
shapiro_ioa_wopa = shapiro(df_clean["ioa_without_pa_mean"])

def interpret_shapiro(nome, resultado):
    stat, p = resultado
    print(f"{nome}:")
    print(f"  Estatística W = {stat:.4f}, p-valor = {p:.6f}")
    if p < 0.05:
        print("  → Rejeita-se a hipótese de normalidade (p < 0.05)")
    else:
        print("  → Não se rejeita a hipótese de normalidade (p ≥ 0.05)")

interpret_shapiro("IOA Mean", shapiro_ioa)
interpret_shapiro("IOA Without PA Mean", shapiro_ioa_wopa)

# ----------------------------
# Executa o teste Wilcoxon 
# ----------------------------
# Diferença pareada entre as colunas
stat, p = wilcoxon(df_clean["ioa_mean"], df_clean["ioa_without_pa_mean"])

print("\n=== Teste de Wilcoxon ===")
print(f"Estatística W: {stat}")
print(f"p-valor: {p:.6f}")

if p < 0.05:
    print("→ Diferença estatisticamente significativa (p < 0.05)")
else:
    print("→ Não há evidência de diferença estatística significativa (p ≥ 0.05)")


# ----------------------------
# Executa o teste t pareado
# ----------------------------
print("\n=== Teste t de Student pareado ===")
t_stat, p_value = ttest_rel(df_clean["ioa_mean"], df_clean["ioa_without_pa_mean"])
print(f"Quantidade de cenários comparados: {len(df_clean)}")
print(f"t-statistic: {t_stat:.4f}")
print(f"p-value: {p_value:.6f}")

alpha = 0.05
if p_value < alpha:
    print("→ Diferença estatisticamente significativa (p < 0.05)")
else:
    print("→ Não há evidência de diferença estatística significativa (p >= 0.05)")

# ----------------------------
# Verifica cenários com desvio padrão > 10% da média
# ----------------------------
print("\n=== Cenários com desvio padrão > 10% da média ===")

def percentual_desvio_sobre_media(std_col, mean_col):
    return (std_col / mean_col) * 100

desvios_ioa = df_clean[df_clean["ioa_std"] > 0.1 * df_clean["ioa_mean"]]
desvios_wpa = df_clean[df_clean["ioa_without_pa_std"] > 0.1 * df_clean["ioa_without_pa_mean"]]

print(f"IOA: {len(desvios_ioa)} cenários com desvio > 10% da média")
print(f"IOA-WITHOUT-PA: {len(desvios_wpa)} cenários com desvio > 10% da média")

# Exibe os nomes dos métodos afetados
print("\n→ Cenários IOA com desvio alto:")
for _, row in desvios_ioa.iterrows():
    percentual = percentual_desvio_sobre_media(row["ioa_std"], row["ioa_mean"])
    acima_10 = percentual - 10
    print(f"  - {row['project']}::{row['class']}::{row['method']} — {percentual:.1f}% ({acima_10:.1f}% acima de 10% da média)")


print("\n→ Cenários IOA-WITHOUT-PA com desvio alto:")
for _, row in desvios_wpa.iterrows():
    percentual = percentual_desvio_sobre_media(row["ioa_without_pa_std"], row["ioa_without_pa_mean"])
    acima_10 = percentual - 10
    print(f"  - {row['project']}::{row['class']}::{row['method']} — {percentual:.1f}% ({acima_10:.1f}% acima de 10% da média)")

# ----------------------------
# Maior e menor desvio padrão por configuração
# ----------------------------
print("\n=== Maior e menor desvio padrão por configuração ===")

def relatorio_desvio_extremo(df, std_col, mean_col, label):
    row_max = df.nlargest(1, std_col).iloc[0]
    row_min = df.nsmallest(1, std_col).iloc[0]

    max_std = row_max[std_col]
    min_std = row_min[std_col]
    mean_max = row_max[mean_col]
    mean_min = row_min[mean_col]

    perc_max = (max_std / mean_max) * 100 if mean_max != 0 else 0
    perc_min = (min_std / mean_min) * 100 if mean_min != 0 else 0

    print(f"\n→ {label}")
    print(f"  Maior desvio padrão: {max_std:.2f} ({perc_max:.1f}% da média)")
    print(f"    - Cenário: {row_max['project']}::{row_max['class']}::{row_max['method']}")
    print(f"    - Média correspondente: {mean_max:.2f}")
    print(f"  Menor desvio padrão: {min_std:.2f} ({perc_min:.1f}% da média)")
    print(f"    - Cenário: {row_min['project']}::{row_min['class']}::{row_min['method']}")
    print(f"    - Média correspondente: {mean_min:.2f}")


relatorio_desvio_extremo(df_clean, "ioa_std", "ioa_mean", "IOA")
relatorio_desvio_extremo(df_clean, "ioa_without_pa_std", "ioa_without_pa_mean", "IOA Without PA")



# ----------------------------
# Média total das execuções (global)
# ----------------------------
media_total_ioa = df_clean["ioa_mean"].mean()
media_total_wpa = df_clean["ioa_without_pa_mean"].mean()

print("\n=== Média global de execução ===")
print(f"IOA: {media_total_ioa:.4f}")
print(f"IOA-WITHOUT-PA: {media_total_wpa:.4f}")

# ----------------------------
# Comparação: qual versão foi mais rápida por cenário
# ----------------------------
mais_rapido_ioa = df_clean[df_clean["ioa_mean"] < df_clean["ioa_without_pa_mean"]]
mais_rapido_wpa = df_clean[df_clean["ioa_mean"] > df_clean["ioa_without_pa_mean"]]

print("\n=== Comparação cenário a cenário ===")
print(f"Cenários em que IOA foi mais rápido: {len(mais_rapido_ioa)}")
print(f"Cenários em que IOA-WITHOUT-PA foi mais rápido: {len(mais_rapido_wpa)}")

print("\n→ IOA mais rápido em:")
for _, row in mais_rapido_ioa.iterrows():
    diff = row["ioa_without_pa_mean"] - row["ioa_mean"]
    print(f"  - {row['project']}::{row['class']}::{row['method']} — {diff:.4f} segundos mais rápido")


print("\n→ IOA-WITHOUT-PA mais rápido em:")
for _, row in mais_rapido_wpa.iterrows():
    diff = row["ioa_mean"] - row["ioa_without_pa_mean"]
    print(f"  - {row['project']}::{row['class']}::{row['method']} — {diff:.4f} segundos mais rápido")

# ----------------------------
# Gera o PDF com a saída do script (em múltiplas páginas)
# ----------------------------
print_output = buffer.getvalue()  # Captura a saída
buffer.close()
sys.stdout = sys.__stdout__  # Restaura stdout

# Parâmetros de renderização
linhas = print_output.splitlines()
linhas_por_pagina = 60  # Ajuste conforme o tamanho da fonte e da página
font_size = 10

# Salva em PDF paginado
pdf_path = "analise_estatistica.pdf"
with PdfPages(pdf_path) as pdf:
    for i in range(0, len(linhas), linhas_por_pagina):
        pagina = linhas[i:i + linhas_por_pagina]
        fig, ax = plt.subplots(figsize=(8.5, 11))  # Tamanho A4 aproximado
        ax.axis("off")
        ax.text(0, 1, "\n".join(pagina), fontsize=font_size, va='top', family="monospace")
        pdf.savefig(fig, bbox_inches="tight")
        plt.close()
print(f"\n✅ PDF gerado com sucesso: {pdf_path}")
