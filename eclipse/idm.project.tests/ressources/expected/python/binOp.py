import pandas as pd
df = pd.DataFrame(list())
df.insert(0,"Stocks",0)
df.at[0, "Stocks"] = (10+10)
df.at[1, "Stocks"] = (10*10)
df.at[2, "Stocks"] = (10-10)
df.at[3, "Stocks"] = (10/10)
df.to_csv("/home/simonlecordier/workspace/m1/IDM/IDM-Projet/eclipse/idm.project.tests/ressources/output/binOpPython.csv", index=False)

