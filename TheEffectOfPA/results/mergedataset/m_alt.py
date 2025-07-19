import csv
from pathlib import Path
from statistics import mean, median, stdev

BASE_DIR = Path(".")
VERSOES = ["ioa", "ioa-without-pa"]
CSV_NAME = "soot-results.csv"
OUTPUT = "merged_results.csv"

def ler_csvs(versao: str):
    """Lê todos os arquivos soot-results.csv de uma versão (ioa ou ioa-without-pa)."""
    versao_dir = BASE_DIR / versao
    entradas = {}
    exec_count = 0

    for subdir in sorted(versao_dir.iterdir()):
        csv_path = subdir / CSV_NAME
        #print(f"Lendo {csv_path}...")
        if not csv_path.exists():
            continue
        exec_count += 1
        with open(csv_path, newline='', encoding='utf-8') as f:
            reader = csv.DictReader(f, delimiter=';')
            for row in reader:
                #print(f"  Processando linha: {row}")
                chave = (row['project'], row['class'], row['method'], row['merge commit'])
                tempo = float(row['Time'])
                entradas.setdefault(chave, []).append(tempo)
                # Limita a 10 execuções
                if len(entradas[chave]) > 10:
                    entradas[chave] = entradas[chave][:10]

    return entradas, exec_count

def formatar_linha(chave, tempos_ioa, tempos_without_pa):
    linha = list(chave)

    # IOA
    linha.extend([str(t) for t in tempos_ioa])
    linha.append(str(mean(tempos_ioa)))
    linha.append(str(median(tempos_ioa)))
    linha.append(str(stdev(tempos_ioa) if len(tempos_ioa) > 1 else 0.0))

    # IOA-WITHOUT-PA
    linha.extend([str(t) for t in tempos_without_pa])
    linha.append(str(mean(tempos_without_pa)))
    linha.append(str(median(tempos_without_pa)))
    linha.append(str(stdev(tempos_without_pa) if len(tempos_without_pa) > 1 else 0.0))

    return linha

def main():
    ioa_data, ioa_execs = ler_csvs("ioa")
    wpa_data, wpa_execs = ler_csvs("ioa-without-pa")

    if ioa_execs != wpa_execs:
        print("⚠️ Número de execuções diferentes entre ioa e ioa-without-pa!")
    
    # Cabeçalho
    header = [
        "project", "class", "method", "merge_commit"
    ] + [f"ioa_exec_{i+1}" for i in range(ioa_execs)] + ["ioa_mean", "ioa_median", "ioa_std"] \
      + [f"ioa_without_pa_exec_{i+1}" for i in range(wpa_execs)] + ["ioa_without_pa_mean", "ioa_without_pa_median", "ioa_without_pa_std"]


    with open(OUTPUT, "w", newline='', encoding='utf-8') as f_out:
        writer = csv.writer(f_out, delimiter=';', quoting=csv.QUOTE_MINIMAL)
        writer.writerow(header)

        for chave in sorted(ioa_data.keys()):
            tempos_ioa = ioa_data.get(chave, [])
            tempos_wpa = wpa_data.get(chave, [])
            writer.writerow(formatar_linha(chave, tempos_ioa, tempos_wpa))

    print(f"✅ Arquivo gerado com sucesso: {OUTPUT}")

if __name__ == "__main__":
    main()
