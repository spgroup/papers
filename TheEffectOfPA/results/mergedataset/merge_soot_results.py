import csv
from pathlib import Path
from statistics import mean, median, stdev

BASE_DIR = Path(".")
CSV_NAME = "soot-results.csv"
OUTPUT = "merged_results.csv"

# Lista negra de cenários (project, class, method, merge_commit)
BLACKLIST = {
    ("antlr4", "org.antlr.v4.codegen.target.Python2Target", "python2Keywords", "69ff2669eec265e25721dbc27cb00f6c381d0b41"),
    ("antlr4", "org.antlr.v4.codegen.target.Python3Target", "python3Keywords", "69ff2669eec265e25721dbc27cb00f6c381d0b41"),
    ("swagger-maven-plugin", "com.github.kongchen.swagger.docgen.reader.AbstractReader", "hasValidAnnotations(List<Annotation>)", "e825a7fdc6ef688f1253b93d2cb236e710acfc56"),
    ("elasticsearch", "org.elasticsearch.common.settings.IndexScopedSettings", "BUILT_IN_INDEX_SETTINGS", "d896886973660785aac45275ddb110c1a6babc57"),
    ("elasticsearch", "org.elasticsearch.common.settings.ClusterSettings", "BUILT_IN_CLUSTER_SETTINGS", "0404db65e3497452886173957729c8e82cfd4a03"),
    ("cloud-slang", "io.cloudslang.lang.api.SlangImplTest", "ALL_EVENTS_SIZE", "20bac30d9bd76569aa6a4fa1e8261c1a9b5e6f76"),
    ("crawler4j", "edu.uci.ics.crawler4j.parser.Parser", "parse(Page, String)", "6fdb8f27b53c5d69b552341a459d0e1fa610f68d"),
}

def ler_csvs(versao: str, campo_oa: str):
    """Lê todos os arquivos soot-results.csv da versão especificada e aplica os filtros."""
    versao_dir = BASE_DIR / versao
    entradas = {}
    exec_count = 0

    for subdir in sorted(versao_dir.iterdir()):
        csv_path = subdir / CSV_NAME
        if not csv_path.exists():
            continue

        exec_count += 1
        with open(csv_path, newline='', encoding='utf-8') as f:
            reader = csv.DictReader(f, delimiter=';')
            for i, row in enumerate(reader):
                chave_base = (row['project'], row['class'], row['method'], row['merge commit'])


                # Filtro: ignora "notfound" e blacklist
                if row.get(campo_oa, "").strip().lower() == "not-found":
                    continue
                if chave_base in BLACKLIST:
                    continue

                try:
                    tempo = float(row['Time'])
                except ValueError:
                    continue

                chave = chave_base + (i,)

                entradas.setdefault(chave, []).append(tempo)
                # Limita a 10 execuções
                if len(entradas[chave]) > 10:
                    entradas[chave] = entradas[chave][:10]

    return entradas, exec_count

def formatar_linha(chave, tempos_ioa, tempos_wpa):
    linha = list(chave)
    linha.extend([str(t) for t in tempos_ioa])
    linha.append(str(mean(tempos_ioa)))
    linha.append(str(median(tempos_ioa)))
    linha.append(str(stdev(tempos_ioa) if len(tempos_ioa) > 1 else 0.0))

    linha.extend([str(t) for t in tempos_wpa])
    linha.append(str(mean(tempos_wpa)))
    linha.append(str(median(tempos_wpa)))
    linha.append(str(stdev(tempos_wpa) if len(tempos_wpa) > 1 else 0.0))
    return linha

def main():
    ioa_data, ioa_execs = ler_csvs("ioa", "OA Inter")
    wpa_data, wpa_execs = ler_csvs("ioa-without-pa", "OA Inter Without Pointer Analysis")

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

        # Interseção das chaves (só escreve quem tem nos dois e não está filtrado)
        for chave in sorted(ioa_data.keys()):
            if chave in wpa_data:
                tempos_ioa = ioa_data[chave]
                tempos_wpa = wpa_data[chave]
                writer.writerow(formatar_linha(chave, tempos_ioa, tempos_wpa))

    print(f"✅ Arquivo gerado com sucesso: {OUTPUT}")

if __name__ == "__main__":
    main()
