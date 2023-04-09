# Задача 1. Напишите программу, которая принимает на
# вход число N и выдает список факториалов для чисел от 1
# до N.
def example1():

    n = int(input('Задайте число: '))
    count = 1
    for el in range(1, n+1):
        count *= el
        print(f'{count}', end=' ')


# Задача 2. Выведите таблицу истинности для выражения
# ¬(X ∧ Y) ∨ Z.
def example2():
    for x in range(2):
        for y in range(2):
            for z in range(2):
                print(f'{x} {y} {z} = {int(not(x and y) or z)}')
        
# Задача 3. Даны две строки. Посчитайте сколько раз
# каждый символ первой строки встречается во второй
def example3():
    str1 = input('Введите строку: ')
    str2 = input('Задайте что нужно найти: ')
    for i in range(len(str2)):
        count = 0
        for j in range(len(str1)):
            if str2[i] == str1[j]:
                count += 1
        print(f'Элемент {str2[i]} всречается {count} раз')

# Задача 4. Задайте список из N элементов, заполненных
# числами из промежутка [-N, N]. Сдвиньте все элементы
# списка на 2 позиции вправо.
def example4():
    n = int(input('Введите число: '))
    n = abs(n)
    i = -n
    a = str('')
    while i <= n:
        a = a+str(i)+' '
        i += 1
    print(a[-4:] + a[:len(a)-2]) #-4 установлено с учётом пробелов


example3()