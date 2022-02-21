import pandas as pd
df = pd.DataFrame(list())
df.insert(0,"Prenom","")
df.insert(1,"Sexe","")
df.at[0, "Prenom"] = "Alexis"
df.at[0, "Sexe"] = "Male"
df.to_csv("C:/Users/Leloup/Documents/FAC/M2/IDM/Git/IDM-Projet/eclipse/idm.project.tests/ressources/output/createAndExport1Python.csv", index=False)

