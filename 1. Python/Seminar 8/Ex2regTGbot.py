import telebot
from telebot import types
import requests
import random

bot = telebot.TeleBot("5999080384:AAE62nWN_RdSbO1AvaLJLdry2EltGUktCr8") 

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

# @bot.message_handler(commands=['start'])
# def welcome(message, where_call=None):
#     if where_call is None:
#         global number
#         number = random.randint(1, 30)
#         msg = bot.send_message(message.chat.id, 'Сможешь угадать число между 1 и 30?')
#         attempt = 1
#         bot.register_next_step_handler(msg, lambda message: random_number(message, attempt))

#     elif where_call == 'not_digit':
#         msg = bot.send_message(message.chat.id, 'только числа')
#         attempt = 1
#         bot.register_next_step_handler(msg, lambda message: random_number(message, attempt))


# def random_number(message, attempt):
#     if message.text.isdigit():
#         n = int(message.text)
#         if attempt < 6:
#             attempt += 1
#             if n < number:
#                 msg = bot.send_message(message.chat.id, 'мало\nещё')
#                 bot.register_next_step_handler(msg, lambda message: random_number(message, attempt))

#             elif n > number:
#                 msg = bot.send_message(message.chat.id, 'много\nещё')
#                 bot.register_next_step_handler(msg, lambda message: random_number(message, attempt))
#             else:
#                 bot.send_message(message.chat.id, 'угадал, с {} попытки!'.format(attempt - 1))
#         else:
#             bot.send_message(message.chat.id, 'попытки исчерпаны\nзагаданное число {0}'.format(number))
#     else:
#         welcome(message, where_call='not_digit')


# bot.polling(none_stop=True, interval=0)