# Задача 1. Дано натуральное число N. Найдите значение выражения:N + NN + NNN
# N может быть любой длины.
def ex1():
    n = input('Введите число: ')
    print(int(n) + int(n + n) + int(n + n + n))

# Задача 2. Задан массив из случайных цифр на 15 элементов. На вход подаётся трёхзначное натуральное число. 
# Напишите программу, которая определяет, есть в массиве последовательность из трёх элементов, совпадающая с введённым числом.
import random
def ex2():
    a = list(random.randint(0,9) for _ in range(15))
    print(a)
    n = str(input('Введите число: '))
    count = 0
    for i in range(len(a) - 2):
        if n == str(a[i]) + str(a[i + 1]) + str(a[i + 2]): 
            count += 1
            continue
    if count >= 1: print(True)
    else: print(False)

# Задача 3. Найдите все простые несократимые дроби, лежащие между 0 и 1, знаменатель которых не превышает 11.
def ex3():
    for i in range(1, 11):
        for j in range(2, 12):
            if i == 1:
                print(f'{i}/{j}', end=' ') 
            else:                
                if i % j != 0 and i / j < 1 and j % i != 0:  
                        if i % 2 !=0 or j % 2 != 0:                      
                            print(f'{i}/{j}', end=' ')


ex3()