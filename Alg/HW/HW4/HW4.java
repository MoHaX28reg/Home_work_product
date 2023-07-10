package Alg.HW.HW4;

public class HW4 {
    public static void main(String[] args) {
        BinTree tree = new BinTree();

        tree.add(4);
        tree.add(5);
        tree.add(7);
        tree.add(2);
        tree.add(3);
        tree.add(8);
        tree.add(1);

        System.out.println(tree.contain(4));
        System.out.println(tree.contain(5));
        System.out.println(tree.contain(7));
        System.out.println(tree.contain(2));
        System.out.println(tree.contain(3));
        System.out.println(tree.contain(8));
        System.out.println(tree.contain(1));
    }
}
