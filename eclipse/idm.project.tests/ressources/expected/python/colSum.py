import pandas as pd
df = pd.read_csv( "/home/simonlecordier/workspace/m1/IDM/IDM-Projet/eclipse/idm.project.tests/ressources/input/fruits.csv" )
df.append(list(), ignore_index=True)
df.at[6, "Article"] = "Benefice Total"
df.at[6, "Benefice"] = df.sum(axis=0)["Benefice"]
df.to_csv("/home/simonlecordier/workspace/m1/IDM/IDM-Projet/eclipse/idm.project.tests/ressources/output/colSumPython.csv", index=False)
