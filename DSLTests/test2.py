import pandas as pd
print("Test Inserts")

df = pd.DataFrame()
df.insert(0, "FirstCol", "")
df.insert(1, "MiddleCol", "")
df.insert(1, "ThirdCol", "")

print("Test Modify")

df.at[0, df.columns[0]] = 1
df.at[0, df.columns[1]] = 2
df.at[0, df.columns[2]] = 3

df.at[1, df.columns[0]] = 1
df.at[1, df.columns[1]] = 2
df.at[1, df.columns[2]] = 3

print("Test sums and prods")
print(df[df.columns[2]].prod())
print(df[df.columns[2]].sum())
print(df[df.columns[0]].sum())
print(df[df.columns[0]].prod())

print("Test Selectcell")
print(df[df.columns[2]][1])

print("Test store and export")
df.to_csv("results/store1.csv")
df.to_json("results/export1.json")



with pd.option_context('display.max_rows', None, 'display.max_columns', None):  # more options can be specified also
    print("\n-------------------\n")
    print(df)