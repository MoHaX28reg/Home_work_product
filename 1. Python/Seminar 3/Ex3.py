# Задача 3. Напишите скрипт генератора паролей
# заданной длины, состоящих из латинских букв и
# чисел.

import random
n = int(input('ВВедите длину пароля: '))
for i in range(n):
    option1 = chr(random.randint(ord('0'), ord('9')))
    option2 = chr(random.randint(ord('a'), ord('z')))
    num = (option1, option2)[random.randint(0, 1)]
    print(num, end='')