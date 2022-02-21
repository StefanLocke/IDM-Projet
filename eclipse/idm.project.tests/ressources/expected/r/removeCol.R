# Creates a new DataFrame from a CSV File
df = data.frame()
#Adds a new Column to the dataframe
df[1,"Prenom"] <- "Default"

#Adds a new Column to the dataframe
df[1,"Sexe"] <- "Default"

#Adds a new Column to the dataframe
df[1,"removedCol"] <- "Default"

#inserts a value at a cell
df[0+1,"Prenom"] = "Alexis"

#inserts a value at a cell
df[0+1,"Sexe"] = "Male"

#removes the column with the given name
df$"removedCol" <- NULL 

write.csv(df,"C:/Users/Leloup/Documents/FAC/M2/IDM/Git/IDM-Projet/eclipse/idm.project.tests/ressources/output/removeColR.csv",quote = FALSE,row.names = FALSE)

