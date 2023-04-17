# Задача 1:
# Создайте кортеж, заполненный случайными числами.
# Напишите метод, который заменяет элемент в
# кортеже по заданному индексу другим случайным
# числом.
import random

def part1():
    num1 = tuple(random.randint(1, 10) for _ in range(10))
    num2 = list(num1)
    print(num1)
    print(num2)
    i = int(input('Введите какой элемент заменить: '))
    num2[i] = random.randint(1, 10)
    num2 = tuple(num2)
    print(num2)

def part2():
    num1 = tuple(random.randint(1, 10) for _ in range(10))
    print(num1)
    i = int(input('Введите какой элемент заменить: '))    
    num2 = tuple(num1[:i] + (random.randint(1, 10), ) + num1[i + 1:])
    print(num2)

part2()