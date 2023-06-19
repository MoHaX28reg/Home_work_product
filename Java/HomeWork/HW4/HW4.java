package Java.HomeWork.HW4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class HW4 {
    public static void main(String [] args) {
        Deque<String> d1 = new ArrayDeque<>(); 
        d1.addLast("3");
        d1.addLast("2");
        d1.addLast("1");
        d1.addLast("-");
        System.out.println(d1);        
        ArrayDeque<String> d2 = new ArrayDeque<>();
        d2.addLast("5");
        d2.addLast("4");
        d2.addLast("3");
        System.out.println(d2);
        int a = TransformDqToInteger(d1);
        int b = TransformDqToInteger(d2);
        int sum = a + b;
        int mult = a * b;
        IntToLinkedList(sum);
        IntToLinkedList(mult);
    }

    public static Integer TransformDqToInteger(Deque<String> args) {
        StringBuilder list = new StringBuilder();
        while (args.size() != 0){
            String a = args.pollLast();
            list.append(a);
        }
        int res = Integer.parseInt(list.toString());
        return res;
    }

    public static void IntToLinkedList(Integer args) {
        LinkedList<Character> res = new LinkedList<>();
        String str = Integer.toString(args);        
        for (int i = 0; i < str.length(); i++) {
            res.add(str.charAt(i));;
        }
        System.out.println(res);      
    }
}
