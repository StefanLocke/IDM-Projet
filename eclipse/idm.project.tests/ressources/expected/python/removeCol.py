import pandas as pd
df = pd.DataFrame(list())
df.insert(0,"Prenom","")
df.insert(1,"Sexe","")
df.insert(2,"removedCol","")
df.at[0, "Prenom"] = "Alexis"
df.at[0, "Sexe"] = "Male"
df = df.drop(columns="removedCol")
df.to_csv("/home/simonlecordier/workspace/m1/IDM/IDM-Projet/eclipse/idm.project.tests/ressources/output/removeColPython.csv", index=False)

