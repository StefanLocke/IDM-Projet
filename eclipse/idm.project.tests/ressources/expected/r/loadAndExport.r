# Creates a new DataFrame from a CSV File
df = read.csv(file = "C:/Users/Leloup/Documents/FAC/M2/IDM/Git/IDM-Projet/eclipse/idm.project.tests/ressources/input/fruits.csv")
write.csv(df,"C:/Users/Leloup/Documents/FAC/M2/IDM/Git/IDM-Projet/eclipse/idm.project.tests/ressources/output/loadAndExportR.csv",quote = FALSE,row.names = FALSE)

