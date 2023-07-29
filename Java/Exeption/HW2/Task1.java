package Java.Exeption.HW2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Введите дробное число: ");   
        String num = sc.next();
        int i = 0;   
        while(i != 1){
            try {                 
                float x = Float.parseFloat(num);
                System.out.println(x);
                i = 1;
            } catch (Exception e) {            
                System.out.println("Введено неверное занчание. Попробуйте ещё раз: ");
                num = sc.next();
            }
        sc.close();
        }
        
    }
}
