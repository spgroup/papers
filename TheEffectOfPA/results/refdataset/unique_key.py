import csv

CSV_PATH = "ioa-without-pa/data1/soot-results.csv"  # ajuste o caminho
CAMPO_OA = "OA Inter Without Pointer Analysis"      # ajuste conforme seu CSV

chaves = set()
cont_not_found = 0
cont_duplicadas = 0

with open(CSV_PATH, encoding='utf-8') as f:
    reader = csv.DictReader(f, delimiter=';')
    for row in reader:
        valor_oa = row.get(CAMPO_OA, "").strip().lower()
        if valor_oa == "not-found":
            cont_not_found += 1
            continue

        chave = (row['project'], row['class'], row['method'], row['merge commit'])
        if chave in chaves:
            cont_duplicadas += 1
        else:
            chaves.add(chave)

print(f"Número de chaves únicas (sem not-found): {len(chaves)}")
print(f"Linhas com '{CAMPO_OA}' = 'not-found': {cont_not_found}")
print(f"Linhas com chaves duplicadas: {cont_duplicadas}")
