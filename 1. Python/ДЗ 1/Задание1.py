# Задача 1. Напишите программу, которая принимает на вход цифру, обозначающую день недели, и выводит название этого дня недели.
day = int(input('введите номер дня недели: '))

if day == 1:
    print('Это понедельник')
elif day == 2:
    print('Это вторник')
elif day == 3:
    print('Это среда')
elif day == 4:
    print('Это четверг')
elif day == 5:
    print('Это пятница')
elif day == 6:
    print('Это суббота')
elif day == 7:
    print('Это воскресение')
else:
    print('нет такого дня недели')