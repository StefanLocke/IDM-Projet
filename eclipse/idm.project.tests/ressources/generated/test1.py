import pandas as pd
df = pd.read_csv( "C:/Users/alexl/Documents/FAC/M2/IDM/IDM-Projet/eclipse/idm.project.tests/ressources/input/fruits.csv" )
df.to_csv("C:/Users/alexl/Documents/FAC/M2/IDM/IDM-Projet/eclipse/idm.project.tests/ressources/output/test1Python.csv", index=False)

