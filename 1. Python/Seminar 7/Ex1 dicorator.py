def stopwatch(func):
    import time
    def decorator():
        start_time = time.time()
        func()
        print(f'время выполнения {time.time() - start_time}')
    return decorator

@stopwatch
def our_math_str():
    num = '132'
    result = int(num) + int(num*2) + int(num*3)
    print(result)

@stopwatch
def our_math_int():
    num = 132
    result = num + num*1000 + num + num*1000000 + num*1000 + num
    print(result)

our_math_str()
our_math_int()