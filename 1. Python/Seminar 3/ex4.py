# Задача 4. Ручка стоит – 5 рублей, карандаш – 3
# рубля, ластик – 4 рубля.
# Кассир последовательно вводит в программу
# позиции из чека «ручка», «карандаш», «ластик».
# Ввод заканчивается, когда введено слово «стоп».
# Определите сумму чека.

product = dict(карандаш = 3,
                ручка = 5,
                ластик = 4)
i = True
sum = 0
while i:
    i2 = input()
    if i2 == 'стоп':
        i = False
    elif i2 in product:
        sum += product[i2]
print(sum)

    
