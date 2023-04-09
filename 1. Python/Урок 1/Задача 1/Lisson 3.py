n = float(input('Введите дробное число: '))

a = int((n % 1 - n % 0.1)*10)
print(a)
