def our_filter(func, numbers):
    return (el for el in numbers if func(el))

def compare_numbers(num):
    return num > 5

numbers = [1, 14, 6, 10, 3, 2, 5]

print( list(filter(compare_numbers, numbers)))
print( list(our_filter(compare_numbers, numbers)))