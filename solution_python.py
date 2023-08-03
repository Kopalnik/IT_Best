ageofvisitors = [25, 18, 31, 61, 52, 14, 10, 11, 13, 70, 34, 21]

numberofkids = []
numberofadults = []
numberofretired = []

for i in ageofvisitors:
    if (i <= 15):
        numberofkids.append(i)
    elif (i >= 16 and i < 60):
        numberofadults.append(i)
    else:
        numberofretired.append(i)

print("Counted number of visitors for category:")
print("Number of kids:", len(numberofkids))
print("Number of adults:", len(numberofadults))
print("Number of retired:", len(numberofretired))
