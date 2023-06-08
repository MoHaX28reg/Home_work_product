//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package Java.HomeWork;

public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        int sum_a = 0;
        for (int i = 1; i <= n; i++){
            sum_a += i;
        }
        System.out.println(sum_a);
        int mult_a = 1;
        for (int i = 1; i <= n; i++){
            mult_a *= i;
        }
        System.out.println(mult_a);
    }
    
}
