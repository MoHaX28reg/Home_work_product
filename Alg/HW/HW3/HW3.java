package Alg.HW.HW3;
// Необходимо реализовать метод разворота связного 
// списка (двухсвязного или односвязного на выбор).
public class HW3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(5);
        list.add(10);
        list.add(32);
        list.add(-5);
        list.add(9);
        list.add(-11);
        list.add(0);
        list.add(21);

        list.print();        
        list.revert();
        
    }
}
