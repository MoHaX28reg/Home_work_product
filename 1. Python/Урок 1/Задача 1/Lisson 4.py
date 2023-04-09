count = 0
number = 1
while True:
    number =  int(input('Введите число '))
    if(number == 0):
        break
    if(number % 3 == 0):
        count += 1
print(f'count =  {count}')