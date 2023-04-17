# Задача 1. Создайте файл. Запишите в него N первых
# элементов последовательности Фибоначчи.
def Example1():
    n = int(input('Задайте число: '))
    list_1 = []
    i = 0
    j = 1 
    if n == 1:
        list_1.append(i)        
    elif n == 2:        
        list_1.append(i)        
        list_1.append(j)        
    elif n > 2:        
        list_1.append(i)        
        list_1.append(j)
        for k in range(n - 2):
            sumFib = i + j
            list_1.append(sumFib)
            i = j
            j = sumFib
    print(list_1)

# Задача 2. В списке находятся названия фруктов.
# Выведите все фрукты, названия которых начинаются на
# заданную букву.
# Список фруктов заполните вручную.

def Example2():
    fruits = ['яблоко', 'апельсин', 'груша', 'банан', 'ананас', 'дыня', 'лимон', 'айва', 'мандарин', 'миниола']
    letter = input('Введите букву: ')
    count = 0
    for i in range(len(fruits)):             
        name = fruits[i]        
        if name[0] == letter:
            print(fruits[i], end=' ')
            count += 1
    if count == 0: print('Такого фрукта нет')

# Задача 3. Создайте скрипт бота, который находит ответы
# на фразы по ключу в словаре. Бот должен, как минимум,
# отвечать на фразы «привет», «как тебя зовут». Если фраза
# ему неизвестна, он выводит соответствующую фразу.
def Example3():
    # ask = {'Привет' or 'Здаров' or 'Добрый день' or 'Здраствуй': 'И вам не хворать'}
    ask = {'Привет' : 'И вам не хворать', 'Здравствуй': 'Пиветик', 'Как тебя зовут': 'Меня зовут Ботя'}
    i = 0
    while i < 2:
        user_say = input('Пользователь: ')
        if user_say in ask: print(f'Ботя: {ask[user_say]}')
        elif user_say == 'стоп': break
        elif user_say not in ask:
            bot_ask = input('Я не понял, как я должен на это ответить? Пользователь: ')
            ask[user_say] = bot_ask
    print('Ботя: Пока')
        
  


Example3()