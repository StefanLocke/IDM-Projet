# Creates a new DataFrame from a CSV File
df = read.csv(file = "C:/Users/Leloup/Documents/FAC/M2/IDM/Git/IDM-Projet/eclipse/idm.project.tests/ressources/input/fruits.csv")
#removes a row at the given index
df <- df[-c(5), ]

write.csv(df,"C:/Users/Leloup/Documents/FAC/M2/IDM/Git/IDM-Projet/eclipse/idm.project.tests/ressources/output/removeLineR.csv",quote = FALSE,row.names = FALSE)

