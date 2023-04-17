# Задача 2:
# На вход подаются два числа. Напишите метод, который вернёт
# сумму, разность, произведение и частное этих чисел.
def ex1():
    n = int(input('ВВедите первое число: '))
    m = int(input('ВВедите второе число: '))

    total = (n + m, n - m, n * m, n / m, )

    print(total)

def colc(n, m):
    return n + m, n - m, n * m, n / m

n = int(input('ВВедите первое число: '))
m = int(input('ВВедите второе число: '))
res = colc(n, m)
print(res)
s, r, p, d = colc(n, m)
print(s, r, p, d)