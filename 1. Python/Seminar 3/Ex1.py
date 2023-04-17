# Задача 1. В списке хранятся сведения о количестве
# осадков, выпавших за каждый день июня.
# Определите в какой период выпало больше осадков:
# в первой или второй половине июня.

import random

rainfall = [random.randint(0, 25) for index in range(30)]
print(rainfall)
sum1 = 0
sum2 = 0
for i in range(15):
    sum1 += rainfall[i]

for i in range(15, 30):
    sum2 += rainfall[i]

if sum1 > sum2:
    print("В первой половине июня было больше осадков")
elif sum1 < sum2:
    print("Во второй половине июня было больше осадков")
else:
    print("В первой и во второй половине июня выпало одинаковое количество осадков")