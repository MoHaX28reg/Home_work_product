package Java.HomeWork.HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW5 {
    public static void main(String [] args) {
        List<String> al = new ArrayList<>();
        al.add("Иванов:12345");
        al.add("Иванов:23456");
        al.add("Петров:34556");
        al.add("Сидоров:45678");
        al.add("Петров:55555");
        al.add("Иванов:67856");
        al.add("Козлов:76543");
        String[] al_1 = new String[al.size()];
        al.toArray(al_1);
        mapBilder(al_1);
        System.out.println(sortList(mapBilder(al_1)));
    
    }    
    public static Map<String, String> mapBilder(String[] al_1) {
        Map<String, String> hm = new HashMap<>();
        for (int i = 0; i < al_1.length; i++){            
            String[] abanent = al_1[i].split(":");
            if (hm.containsKey(abanent[0])) {                    
                String ov = hm.get(abanent[0]);
                hm.put(abanent[0], abanent[1] + "," + ov);
            }
            else {
                hm.put(abanent[0], abanent[1]);
            }
        }
        return hm;
    }
    public static List<String> sortList(Map<String, String> args) {
        Object[] list = args.entrySet().toArray();
        String[] list_2 = new String[args.size()];
        list_2 = Arrays.toString(list).split(", ");
        List<String> list_1 = new ArrayList<>();
        for (int i = 0; i < list_2.length; i++) {
            String max = list_2[i];
            for (int j = i; j < list.length; j++){                
                if (list_2[j].length() > max.length()) {
                    String temp = max;
                    max = list_2[j];
                    list_2[j] = temp;
                }
            }    
            list_1.add(max);                
            
        }
        return list_1;
    }
}
