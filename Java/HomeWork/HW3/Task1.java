package Java.HomeWork.HW3;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;


public class Task1 {
    public static void main(String [] args) {
        List<Integer> arr = new ArrayList<>(10);
        Random r = new Random();
        for (int i = 0; i < 10; i++){
            arr.add(r.nextInt(100));
        }
        System.out.println(arr);
        DeleteHonest(arr);
        MaxVal(arr);
        MinVal(arr);
        MeanVal(arr);
    }

    public static void DeleteHonest(List<Integer> args) {
        List<Integer> ListOdd = new ArrayList<>();
        for (int i = 0; i < args.size(); i++){
            if (args.get(i) % 2 != 0) {
                ListOdd.add(args.get(i));
            }
        }
        System.out.println(ListOdd);       
    }

    public static void MaxVal(List<Integer> args) {
        int max = args.get(0);
        for (int i = 1; i < args.size(); i++){
            if (args.get(i) > max){
                max = args.get(i);
            }
        }
        System.out.println(max);
    }

    public static void MinVal(List<Integer> args) {
        int min = args.get(0);
        for (int i = 1; i < args.size(); i++){
            if (args.get(i) < min){
                min = args.get(i);
            }
        }
        System.out.println(min);
    }

    public static void MeanVal(List<Integer> args) {        
        double sum = 0;
        for (int i = 0; i < args.size(); i++){
            sum += args.get(i);
        }
        double mean = sum / args.size();
        System.out.println(mean);
    }
}
