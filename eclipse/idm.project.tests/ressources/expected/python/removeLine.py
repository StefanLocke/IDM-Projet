import pandas as pd
df = pd.read_csv( "/home/simonlecordier/workspace/m1/IDM/IDM-Projet/eclipse/idm.project.tests/ressources/input/fruits.csv" )
df = df.drop(5)
df.to_csv("/home/simonlecordier/workspace/m1/IDM/IDM-Projet/eclipse/idm.project.tests/ressources/output/removeLinePython.csv", index=False)

