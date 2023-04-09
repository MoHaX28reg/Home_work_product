# Задача 3. Дано число N. Заполните список длиной N
# элементами 1, -3, 9, -27, 81, -243

n = int(input('Введите число: '))

count1 = []

for el in range(n):
    count1.append((-3) ** el)

print(count1)