# Задача 1. Выведите таблицу истинности для
# выражения ¬ X ∨ Y

for x in range(2):
    for y in range(2):
        print(f'{x} {y} = {int(not(x) or y)}')
        