import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

# Read the resulting file
df = pd.read_csv("merged_results.csv", delimiter=';')

# Convert mean columns to float
df["ioa_mean"] = df["ioa_mean"].astype(float)
df["ioa_without_pa_mean"] = df["ioa_without_pa_mean"].astype(float)

# Reshape data to long format
df_melted = pd.melt(
    df,
    value_vars=["ioa_mean", "ioa_without_pa_mean"],
    var_name="Configuration",
    value_name="Mean Time"
)

# Rename for nicer labels
df_melted["Configuration"] = df_melted["Configuration"].map({
    "ioa_mean": "PA",
    "ioa_without_pa_mean": "noPA"
})

# Style and palette
sns.set(style="whitegrid")
plt.figure(figsize=(10, 6))

# Violin plot (density)
sns.violinplot(data=df_melted, x="Mean Time", y="Configuration", inner=None, color=".85")

# Strip plot (individual points)
sns.stripplot(data=df_melted, x="Mean Time", y="Configuration", jitter=0.2, size=4, alpha=0.6)

#plt.title("Distribuição das Médias por Cenário (Raincloud alternativo)", fontsize=14)
plt.tight_layout()
plt.savefig("raincloud_plot_mds.png", dpi=300)
plt.show()
