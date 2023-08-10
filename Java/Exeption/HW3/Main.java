package Java.Exeption.HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> user = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные пользователя(ФИО, ДР в формате дд.мм.гггг, пол, телефон) через Enter: ");
        try {
            String data1 = sc.nextLine();            
            String data2 = sc.nextLine();
            String data3 = sc.nextLine();
            String data4 = sc.nextLine();
            user.add(data1);
            user.add(data2);
            user.add(data3);
            user.add(data4);
            System.out.println(user);
        } catch (NullPointerException e) {
            System.out.println("Вы не ввели все требуемые данные. Попробуйте еще раз.");
        }
        sc.close();
        
        UserDate userDate = new UserDate(user);

        String fileName = userDate.lastName(user);
        CreateAndSave saveFile = new CreateAndSave();
        saveFile.save(fileName, userDate);


        System.out.println(userDate);
    }
}  
