import pandas as pd

### Create dataframe > Create
df = pd.DataFrame()

### Load csv as dataframe > Load(PATH)
df = pd.read_csv(PATH)

### Insert column > InsertCol(INDEX, COLUMN_NAME, DEFAULT_VALUE)
df.insert(int:INDEX, COLUMN_NAME, DEFAULT_VALUE)

### Insert element from column name > Insert(ROW_INDEX, COLUMN_NAME, VALUE)
df.at[ROW_INDEX, COLUMN_NAME] = VALUE

### Insert element from column id > Insert(ROW_INDEX, COLUMN_ID, VALUE)
df.at[ROW_INDEX, df.columns[COLUMN_ID]] = VALUE

### Insert empty line at end > InsertLine(INDEX)
df.loc[df.size] = [None] * df.columns.size

### Insert empty line at specific position > InsertLine(INDEX, DEFAULT_VALUE)
df.loc[INDEX] = [DEFAULT_VALUE] * df.columns.size

### Insert specific line > InsertLine(INDEX, E1, E2, ...)
df.loc[INDEX] = [E1, E2, ...]

### Remove Col with col name > RemoveColByName(COLUMN_NAME)
df = df.drop(columns=COLUMN_NAME)

### Remove Col with col id > RemoveColById(INDEX)
df = df.drop(columns=df.columns[INDEX])

### Remove line > RemoveLine(INDEX)
df = df.drop(INDEX)

### Export to csv > ExportCSV(PATH)
df.to_csv("results/store1.csv")

### Export to json > ExportJSON(PATH)
df.to_json("results/export1.json")