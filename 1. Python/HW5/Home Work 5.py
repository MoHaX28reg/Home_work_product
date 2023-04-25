# Задача 1. Задайте список случайных чисел от 1 до 10,
# выведите все элементы больше 5. Используйте для решения
# лямбда-функцию.
import random
def ex1():
    a = list(random.randint(1, 10) for _ in range(10))
    print(a)
    b = list(filter(lambda a: a > 5, a))
    print(b)

# Задача 2. Дан список случайных чисел. Создайте список, в
# который попадают числа, описывающие возрастающую
# последовательность. Порядок элементов менять нельзя.
def sort_list(arr):
    list_1 = []
    num = 0
    for i in range(len(arr)):
        if arr[i] > num:
            num = arr[i]
            list_1.append(num)
    return list_1

def ex2():
    a = list(random.randint(1, 7) for _ in range(10))   
    print(a)
    b = sort_list(a)
    print(b)

# Задача 3. Задайте список случайных чисел от 1 до 10.
# Посчитайте, сколько всего совпадающих элементов есть в
# списке. Удалите все повторяющиеся элементы.
def array(a):    
    count_2 = list(set(a))
    count_3 = 0
    for i in range(len(count_2)):
        count_1 = 0
        for j in range(len(a)):            
            if count_2[i] == a[j]:
                count_1 += 1
        if count_1 > 1:
            count_3 += count_1
    return (count_3)


def ex3():
    a = list(random.randint(1, 9) for _ in range(10))
    print(a)
    b = list(set(a))
    d = array(a)    
    print(f' {d} элемента совпадают')
    print(b)

ex2()