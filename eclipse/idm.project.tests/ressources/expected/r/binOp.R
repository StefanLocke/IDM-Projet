# Creates a new DataFrame from a CSV File
df = data.frame()
#Adds a new Column to the dataframe
df[1,"Stocks"] <- "Default"

#inserts a value at a cell
df[0+1,"Stocks"] = (10+10)

#inserts a value at a cell
df[1+1,"Stocks"] = (10*10)

#inserts a value at a cell
df[2+1,"Stocks"] = (10-10)

#inserts a value at a cell
df[3+1,"Stocks"] = (10/10)

write.csv(df,"C:/Users/Leloup/Documents/FAC/M2/IDM/Git/IDM-Projet/eclipse/idm.project.tests/ressources/output/binOpR.csv",quote = FALSE,row.names = FALSE)

