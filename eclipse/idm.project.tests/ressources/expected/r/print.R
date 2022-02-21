# Creates a new DataFrame from a CSV File
df = data.frame()
#Adds a new Column to the dataframe
df[1,"Stocks"] <- "Default"

#inserts a value at a cell
df[0+1,"Stocks"] = (10+10)

#Prints a expression
print(as.numeric(df[0+1,"Stocks"]))

write.csv(df,"C:/Users/Leloup/Documents/FAC/M2/IDM/Git/IDM-Projet/eclipse/idm.project.tests/ressources/output/printR.csv",quote = FALSE,row.names = FALSE)

