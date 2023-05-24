# задача 1. Создайте пользовательский аналог метода map().
def ex1():
    def our_functin(func, numbers):
        return (func(el) for el in numbers)

    def sum_numbers(num):
        return num + 2

    numbers = [1, 6, 12, -4, 0]

    print( list(map(sum_numbers, numbers)))
    print( list(our_functin(sum_numbers, numbers)))

# Задача 2. Создайте декоратор, повторяющий функцию заданное количество раз.
def ex2():
    def sum_count(func):
        def decorator(a):            
            for el in range(n - 1):
                func(a)
            
            func(a)         
        return decorator
    
    @sum_count
    def sum_numbers(b):
        b += 3
        print(b)
        
    n = 5
    sum_numbers(1)

def ex3():
    import telebot
    from telebot import types
    import requests
    import random

    bot = telebot.TeleBot("TOKEN") 

    @bot.message_handler(commands=['start', 'help'])
    def send_welcome(message):
        bot.send_message(message.from_user.id, "Привет")

    storage = dict()

    def init_storage(user_id):
        storage[user_id] = dict(count=None, random_digit=None)

    def set_data_storage(user_id, key, value):
        storage[user_id][key] = value

    def get_data_storage(user_id):
        return storage[user_id]    

    @bot.message_handler(func=lambda message: message.text.lower() == 'играть')
    def game_num(message):     
        init_storage(message.chat.id)
        n = random.randint(1, 99)
        count = 1
        set_data_storage(message.chat.id, "n", n)    
        set_data_storage(message.chat.id, "count", count)
        
        bot.send_message(message.chat.id, 'Я загадал число от 1 до 99. Попробуй угадать. Введи число: ')
        bot.register_next_step_handler(message, enter_num)

    def enter_num(message):
        m = message.text
        if not m.isdigit():
            msg = bot.reply_to(message, 'Вы ввели не цифры, введите пожалуйста цифры')
            bot.register_next_step_handler(msg, enter_num)
            return
        n = get_data_storage(message.chat.id)["n"]     
        count = get_data_storage(message.chat.id)["count"]    
        if int(m) < n:
            count += 1
            set_data_storage(message.chat.id, "count", count)
            bot.send_message(message.chat.id, 'Это число меньше загаданного. Введи число: ')
            bot.register_next_step_handler(message, enter_num)
        elif int(m) > n:
            count += 1
            set_data_storage(message.chat.id, "count", count)
            bot.send_message(message.chat.id, 'Это число больше загаданного. Введи число: ')
            bot.register_next_step_handler(message, enter_num)
        else:
            bot.send_message(message.chat.id, (f'Угадал)). Число попыток:{count}'))
            init_storage(message.chat.id)
            return
        
    bot.polling()


ex3()