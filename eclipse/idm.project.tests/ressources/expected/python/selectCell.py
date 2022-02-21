import pandas as pd
df = pd.DataFrame(list())
df.insert(0,"Stocks",0)
df.at[0, "Stocks"] = 40
df.at[1, "Stocks"] = 25
df.at[2, "Stocks"] = 10
df.at[3, "Stocks"] = (df.at[0,"Stocks"]+df.at[1,"Stocks"])
df.to_csv("/home/simonlecordier/workspace/m1/IDM/IDM-Projet/eclipse/idm.project.tests/ressources/output/selectCellPython.csv", index=False)

