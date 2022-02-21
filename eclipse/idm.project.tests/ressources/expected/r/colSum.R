# Creates a new DataFrame from a CSV File
df = read.csv(file = "C:/Users/Leloup/Documents/FAC/M2/IDM/Git/IDM-Projet/eclipse/idm.project.tests/ressources/input/fruits.csv")
#inserts a value at a cell
df[6+1,"Article"] = "Benefice Total"

#inserts a value at a cell
df[6+1,"Stock"] = sum(as.numeric(df$"Benefice"),na.rm = TRUE)

write.csv(df,"C:/Users/Leloup/Documents/FAC/M2/IDM/Git/IDM-Projet/eclipse/idm.project.tests/ressources/output/colSumR.csv",quote = FALSE,row.names = FALSE)

