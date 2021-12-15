import csv

import pandas
import pandas as pd

#df = pd.read_csv("CsvTestFile.csv")
df = pandas.DataFrame()

print(type(df))
df.insert(0, "0", "")
df.insert(1, "1", "")
df.insert(2, "2", "")
df.insert(3, "3", "")
df.insert(4, "FACTORIEL", "grrgd")

print(df.to_csv())