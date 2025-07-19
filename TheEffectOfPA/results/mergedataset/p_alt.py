import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Lê o CSV de entrada
df = pd.read_csv("merged_results.csv", delimiter=';')

# Prepara os dados no formato longo
df_long = pd.DataFrame({
    "IOA": df["ioa_mean"].astype(float),
    "IOA Without PA": df["ioa_without_pa_mean"].astype(float)
})

df_melted = df_long.melt(var_name="Tipo", value_name="Tempo Médio")

# Plot
sns.set(style="whitegrid")
plt.figure(figsize=(10, 6))

# Violin (densidade)
sns.violinplot(x="Tempo Médio", y="Tipo", data=df_melted, inner=None, color=".8")

# Pontinhos (distribuição individual)
sns.stripplot(x="Tempo Médio", y="Tipo", data=df_melted, jitter=0.2, size=4, alpha=0.6)

# Título
plt.title("Raincloud alternativo: Distribuição das Médias por Cenário", fontsize=14)
plt.tight_layout()
plt.savefig("raincloud_alternativo.png", dpi=300)
plt.show()
