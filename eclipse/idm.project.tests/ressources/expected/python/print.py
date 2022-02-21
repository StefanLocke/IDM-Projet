import pandas as pd
df = pd.DataFrame(list())
df.insert(0,"Stocks",0)
df.at[0, "Stocks"] = (10+10)
print(df.at[0,"Stocks"])
df.to_csv("/home/simonlecordier/workspace/m1/IDM/IDM-Projet/eclipse/idm.project.tests/ressources/output/printPython.csv", index=False)

