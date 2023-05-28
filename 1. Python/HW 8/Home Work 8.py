import telebot
from telebot import types
import requests
import random

bot = telebot.TeleBot("") 
@bot.message_handler(commands=['start', 'help'])
def send_welcome(message):
	bot.send_message(message.from_user.id, "Привет, задайте Ваш вопрос: ")

@bot.message_handler(content_types=['text'])
def text_message(message):	
    data_1 = open('Question_users.txt', mode='a', encoding='utf-8')
    question = f'{message.from_user.id}: {message.text}\n'
    data_1.write(question)
    data_1.close()	


bot.polling()

