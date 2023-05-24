def greetings(hello):
    def our_greetings(func):
        def decorator():
            name = func()
            print(f'{hello}, {name}')
        return decorator
    return our_greetings

@greetings('Привет')
def get_name():
    return input('Как тебя зовут?\n')

get_name()