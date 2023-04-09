a = int(input('Введите число a: '))
b = int(input('Введите число b: '))
c = int(input('Введите число c: '))

if a > b and a > c:
    print(f'a наибольшее значение')
elif b > c:
    print(f'b наибольшее значение')
else:
    print(f'с наибольшее значение')

if a < b and a < c:
    print(f'a наименьшее значение')
elif b < c:
    print(f'b наименьшее значение')
else:
    print(f'с наименьшее значение')