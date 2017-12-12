package task3;

import static task3.Colors.Color.RED;
import static task3.Colors.Color.BLACK;

public class RBT implements Colors {
    private Node root;

    private class Node {
        int value;
        Node left;
        Node right;
        Node parent;
        Color color = RED;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            String result = this.color + ": " + this.value;
            if (parent != null) {
                result += " parent: " + parent.value + "\n";
            } else {
                result += "\n";
            }
            return result;
        }
    }

    public void putElement(int value) {
        if (root == null) {
            root = new Node(value);
            root.color = BLACK;
        } else {
            addElement(new Node(value), root);
        }
    }

    private void addElement(Node element, Node location) {
        element.parent = location;
        if (location.value > element.value) {
            if (location.left == null) {
                element.parent.left = element;
            } else {
                addElement(element, location.left);
            }
        } else if (location.value < element.value) {
            if (location.right == null) {
                element.parent.right = element;
            } else {
                addElement(element, location.right);
            }
        }
        rebalance(element);
    }

    public void showTree(Node node, int level) {
        if (node == null) {
            return;
        }
        showTree(node.left, level+1);
        for (int i=0;i<level;i++){
            System.out.print(" ");
        }
        System.out.print(node);
        showTree(node.right, level+1);
    }

    private void rebalance(Node element) {

    }

    public void displayTree() {
        showTree(root, 0);
    }

    public static void main(String[] args) {
        RBT rbt = new RBT();
        rbt.putElement(5);
        rbt.putElement(7);
        rbt.putElement(6);
        rbt.displayTree();
    }
}
