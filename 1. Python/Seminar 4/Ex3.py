# Задача 3:
# Сгенерируйте список случайных чисел от 1 до 20,
# состоящий из 10 элементов. Удалите из списка
# дубликаты уже имеющихся элементов. Определите,
# сколько элементов было удалено.

import random
list_1 = list(random.randint(1, 20) for _ in range(20))
print(list_1)
l = int(len(list_1))
list_1 = list(set(list_1))
m = int(len(list_1))
del_list = l - m
print(list_1)
print(del_list)
    