import pandas as pd

# Create dataframe
# df = pd.DataFrame()

# Load csv as dataframe
# df = pd.read_csv("CsvTestFile.csv")

# Insert element in specific column
# df.insert(int:ROW, string:COLUMN_NAME, VALUE)
# example : df.insert(0, "Article", "")

# Insert element in specific column with id
# df.insert(int:ROW, df.columns[int:POSITION], VALUE)
# example : df.insert(0, "Article", "")

# Insert empty line at end
# df.loc[df.size] = [None] * df.columns.size

# Insert empty line at specific position
# df.loc[POSITION] = [None] * df.columns.size

# Insert specific line
# df.loc[POSITION] = [e1,e2,...]

# Remove Col with col name
# df = df.drop(columns=NAME)

# Remove Col with col id
# df = df.drop(columns=df.columns[ID])

# Remove line
# df = df.drop(POSITION)
