# Задача 4. Найдите все числа до 10000, у который
# количество делителей равно 10. 


count = 0
for el in range(1, 10001):
    count_div = 0
    for div in range(1, el+1):
        if el % div == 0:
            count_div += 1
            print(el)
        count += 1

    
print(count)