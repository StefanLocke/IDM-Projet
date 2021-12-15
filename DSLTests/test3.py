import pandas as pd

df = pd.DataFrame()
df.insert(0, "Article", "")
df.insert(1, "Stock", "")
df.insert(2, "Prix", "")
df.insert(3, "Error", "")

df.at[0, df.columns[0]] = "Pomme"
df.at[0, df.columns[1]] = 2
df.at[0, df.columns[2]] = 1

df.at[1, df.columns[0]] = "Banane"
df.at[1, df.columns[1]] = 10
df.at[1, df.columns[2]] = 2

df.at[2, df.columns[0]] = "Peche"
df.at[2, df.columns[1]] = 5
df.at[2, df.columns[2]] = 6

df.at[3, df.columns[0]] = "ERROR"
df.at[3, df.columns[1]] = 100
df.at[3, df.columns[2]] = 100

df = df.drop(3)
df = df.drop(columns=df.columns[3])

df.insert(3, "Benefice", "")
df["Benefice"] = df["Stock"] * df["Prix"]

df.to_csv("results/recettesFruits.csv")

with pd.option_context('display.max_rows', None, 'display.max_columns', None):  # more options can be specified also
    print("\n-------------------\n")
    print(df)