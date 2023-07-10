package Alg.HW.HW4;

public class BinTree {
    Node root;

    public boolean add(int value) {
        if (root != null) {
            boolean resalt = addNode(root, value);
            root = rebalnce(root);
            root.color = Color.black;
            return resalt;            
        }
        else {
            root = new Node();
            root.color = Color.black;
            root.value = value;
            return true;
        }

    }
    private boolean addNode(Node node, int value) {
        if (node.value == value)
            return false;
        else {
            if (node.value > value) {
                if (node.left == null) {
                    node.left = new Node(value);
                    node.left.color = Color.red;
                    node.left.value = value;
                    return true;
                } else {
                    boolean result = addNode(node.left, value);
                    node.left = rebalnce(node.left);
                    return result;
                }
            } else {
                if (node.right == null) {
                    node.right = new Node(value);
                    node.right.color = Color.red;
                    node.right.value = value;
                    return true;
                } else {
                    boolean result = addNode(node.right, value);
                    node.right = rebalnce(node.right);
                    return result;
                }
            }
        }

    }

    public boolean contain(int value) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.value == value)
                return true;
            if (currentNode.value > value)
                currentNode = currentNode.left;
            else
                currentNode = currentNode.right;
        }
        return false;
    }

    private class Node {
        int value;
        Node left;
        Node right;
        Color color;

        Node() {
            this.color = Color.red;
        }

        Node(int _value) {
            this.value = _value;
            this.color = Color.red;
        }
    }

    enum Color {
        red, black
    }

    private void colorChange(Node node) {
        node.right.color = Color.black;
        node.left.color = Color.black;
        node.color = Color.red;
    }

    private Node leftChange(Node node) {
        Node left = node.left;
        Node betweenLeaf = left.right;
        left.right = node;
        node.left = betweenLeaf;
        left.color = node.color;
        node.color = Color.red;
        return left;
    }

    private Node rightChange(Node node) {
        Node right = node.right;
        Node betweenLeaf = right.left;
        right.left = node;
        node.right = betweenLeaf;
        right.color = node.color;
        node.color = Color.red;
        return right;
    }

    private Node rebalnce(Node node) {
        Node resalt = node;
        boolean needReb;
        do {
            needReb = false;
            if (resalt.right != null && resalt.right.color == Color.red && resalt.left != null && resalt.left.color == Color.black) {
                needReb = true;
                resalt = rightChange(resalt);
            }
            if (resalt.left != null && resalt.left.color == Color.red && resalt.left.left != null && resalt.left.left.color == Color.red) {
                needReb = true;
                resalt = leftChange(resalt);
            }
            if (resalt.left != null && resalt.left.color == Color.red && resalt.right != null && resalt.right.color == Color.red) {
                needReb = true;
                colorChange(resalt);;
            }            
        }
        while (needReb);
        return resalt;        
    }
}
