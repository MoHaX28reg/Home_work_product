import numpy as np
# Задача 1. Дан список элементов. Используя библиотеку NumPy, подсчитайте количество
# уникальных элементов в нём.
def ex1():
    num = np.random.randint(1, 10, 10)
    print(num)
    el_un = np.unique(num)
    print(el_un)
    count_el = len(el_un)
    print(count_el)

# Задача 2. Создайте двумерный массив, размером 5х5. Определите, есть ли в нём
# одинаковые строки.
def ex2():
    num = np.random.randint(1, 3, (5, 5))    
    print(num)
    data = np.corrcoef(num)    
    count = 0
    for i in data:
        count_2 = 0        
        for j in i:            
            if j == 1.0:                
                count_2 += 1
        if count_2 > 1:
            count += 1
            
    if count > 0:
        print('Есть одинаковые строки')
    else:
        print('Одинаковых строк нет')

   
# Задача 3. Создайте двумерный массив случайного размера. Найдите индексы
# максимального и минимального элементов в нём.
# Выведите элементы главной диагонали матрицы в виде одномерного массива.
def ex3():
    size = np.random.randint(3, 6, 2)
    print(size)
    num = np.random.randint(1, 100, size)
    print(num)
    max_ind = np.unravel_index(np.argmax(num), num.shape)
    min_ind = np.unravel_index(np.argmin(num), num.shape)
    print(f'индекс минимального элемента: {min_ind}\nиндекс максимального элемента: {max_ind}')
    diag = np.diag(num)
    print(diag)   


ex2()