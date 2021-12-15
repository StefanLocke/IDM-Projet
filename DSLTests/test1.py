import pandas as pd

df = pd.read_csv("CsvTestFile.csv")

# Inserer colonne
df.insert(1, "Prenom", "")
df.insert(2, "Sexe", "")

df.at[0, df.columns[1]] = "Alexis"
df.at[0, df.columns[2]] = "Male"
# Supprimer insertline car on peut inserer precisement sans ligne

print(df[df.columns[1]][0])