# Creates a new DataFrame from a CSV File
df = data.frame()
#Adds a new Column to the dataframe
df[1,"Stocks"] <- "Default"

#inserts a value at a cell
df[0+1,"Stocks"] = 40

#inserts a value at a cell
df[1+1,"Stocks"] = 25

#inserts a value at a cell
df[2+1,"Stocks"] = 10

#inserts a value at a cell
df[3+1,"Stocks"] = (as.numeric(df[0+1,"Stocks"])+as.numeric(df[1+1,"Stocks"]))

write.csv(df,"C:/Users/Leloup/Documents/FAC/M2/IDM/Git/IDM-Projet/eclipse/idm.project.tests/ressources/output/selectCellR.csv",quote = FALSE,row.names = FALSE)

