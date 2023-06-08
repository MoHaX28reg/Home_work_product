// 3) Реализовать простой калькулятор
// + - / *

// Введите первое число: A \n
// Введите знак: *
// Введите второе число: B
// Результат: A*B

// sc.next() -- считывает символ
// sc.nextLine() -- считывает всю строчку
// sc.nextInt() -- считывает число, но без перехода на след. строчку
package Java.HomeWork;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действие: ");
        char x = scanner.next().charAt(0);
        System.out.println("Введите первое число: ");
        double a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        double b = scanner.nextInt();
        double res;
        switch (x) {
            case '+':
                res = a + b;
                System.out.println(res);
                break;
            case '-':
                res = a - b;
                System.out.println(res);
                break;
            case '*':
                res = a * b;
                System.out.println(res);
                break;
            case '/':
                res = a / b;
                System.out.println(res);
                break;            
        } 
    }
}
