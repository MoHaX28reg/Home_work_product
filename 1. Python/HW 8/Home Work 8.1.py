import telebot

bot = telebot.TeleBot("") 
data = open('Question_users.txt', mode='r', encoding='utf-8')
question = data.readline().split(':')
print(question)
bot.send_message(question[0], f'Ваш вопрос: {question[1]}')
answer = input()
bot.send_message(question[0], f'Наш ответ: {answer}')
