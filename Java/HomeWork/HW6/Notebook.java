package Java.HomeWork.HW6;

public class Notebook {
    
    Integer RAM;
    Integer HDD;
    String os;
    String color;

    @Override
    public String toString() {
        return String.format("RAM:%d HDD:%d os:%s color:%s", RAM, HDD, os, color);
    }

    // @Override
    // public int hashCode() {
    //     return RAM;
    // }
}
