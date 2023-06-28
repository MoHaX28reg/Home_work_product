package Java.HomeWork.HW6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Notebook notebook_1 = new Notebook();
        notebook_1.RAM = 4;
        notebook_1.HDD = 256;
        notebook_1.os = "windows10";
        notebook_1.color = "black";

        Notebook notebook_2 = new Notebook();
        notebook_2.RAM = 8;
        notebook_2.HDD = 256;
        notebook_2.os = "Linux";
        notebook_2.color = "white";

        Notebook notebook_3 = new Notebook();
        notebook_3.RAM = 4;
        notebook_3.HDD = 512;
        notebook_3.os = "windows11";
        notebook_3.color = "red";
        
        Notebook notebook_4 = new Notebook();
        notebook_4.RAM = 16;
        notebook_4.HDD = 1028;
        notebook_4.os = "Linux";
        notebook_4.color = "black";

        Notebook notebook_5 = new Notebook();
        notebook_5.RAM = 8;
        notebook_5.HDD = 512;
        notebook_5.os = "windows10";
        notebook_5.color = "white";
        
        HashSet<Notebook> notebooks = new HashSet<Notebook>(Arrays.asList(notebook_1, notebook_2, notebook_3, notebook_4, notebook_5));
        System.out.println(notebooks);
        Scanner sc = new Scanner(System.in);
        System.out.println("Приветвую.\nВведите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД hd hdd \n 3 - Операционная система\n 4 - Цвет");
        String number = sc.nextLine();
        System.out.println("Введите требуюмую характеристику: ");
        String charact = sc.nextLine();
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < notebooks.size(); i++){
            String arr = notebooks.toArray()[i].toString();
            String[] arr1 = arr.split(" ");
            switch (number) {
                case "1":
                    String a = ("RAM:" + charact);
                        String b = arr1[0];
                        if (b.equals(a)){
                            res.add(arr);                        
                        }                         
                    break;
                case "2":
                    String c = ("HDD:" + charact);
                        String d = arr1[1];
                        if (d.equals(c)){
                            res.add(arr);                        
                        }                         
                    break;
                case "3":
                    String e = ("os:" + charact);
                        String f = arr1[2];
                        if (f.equals(e)){
                            res.add(arr);                        
                        }                         
                    break;
                case "4":
                    String g = ("color:" + charact);
                        String h = arr1[3];
                        if (h.equals(g)){
                            res.add(arr);                        
                        }                         
                    break;
                default:
                    System.out.println("ведено неизвестное значение");
                    break;
            }
             
        }
        System.out.println(res);
       
    }       
    
}
