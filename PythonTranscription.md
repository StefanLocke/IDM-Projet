import pandas as pd

### Create dataframe > Create
df = pd.DataFrame()

### Load csv as dataframe > Load(file)
df = pd.read_csv("CsvTestFile.csv")

### Insert column > InsertCol
df.insert(int:POSTITION, string:NAME, COLUMN_VALUE)

### Insert element from column name >
df.at[1, df.columns[NAME]] = VALUE

### Insert element from column id >
df.at[1, df.columns[ID]] = VALUE

### Insert empty line at end
df.loc[df.size] = [None] * df.columns.size

### Insert empty line at specific position
df.loc[POSITION] = [None] * df.columns.size

### Insert specific line
df.loc[POSITION] = [e1,e2,...]

### Remove Col with col name
df = df.drop(columns=NAME)

### Remove Col with col id
df = df.drop(columns=df.columns[ID])

### Remove line
df = df.drop(POSITION)

### Export to csv
df.to_csv("results/store1.csv")

### Export to json
df.to_json("results/export1.json")