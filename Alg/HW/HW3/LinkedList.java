package Alg.HW.HW3;

public class LinkedList {
    private Node root;
    private Node head;

    private int size;

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
            size = 1;
            return;
        }
        Node currentNode = root;
        while (currentNode.next != null)
            currentNode = currentNode.next;
        currentNode.next = new Node(value);
        size++;
        
    }

    public void print(){ 
        Node currentNode = root;
        while (currentNode != null){
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    

    private class Node {
        int value;
        Node next;
        Node (int _value) { this.value = _value; }        
    }

    public void revert() {
        Node temp = head;
        if (head != null && head.next != null){
            revert(head.next, head);
            temp.next = null;
        }
    }

    private void revert(Node currentNode, Node previousNode){
        if (currentNode.next == null){
            head = currentNode;
        }
        else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
    }
}
