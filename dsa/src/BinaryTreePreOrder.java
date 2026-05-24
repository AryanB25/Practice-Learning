public class BinaryTreePreOrder {
    // represents the structure of the nodes
    static class Node {
        private int data; // stores the data of the nodes
        private Node right; // stores the right node of the current node in the tree
        private Node left; // stores the left node of the current node in the tree

        // constructor
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // represents the binary tree
    static class BinaryTree {
        private int index = -1; // counter to store the current index

        Node buildTree(int orders[]) {
            index++; // current index

            if (orders[index] == -1) { // if there are no children
                return null;
            }

            Node newNode = new Node(orders[index]);
            newNode.left = buildTree(orders); // recursive call to build the left of the tree
            newNode.right = buildTree(orders); // recursive call to build the right of the tree

            return newNode; // return the root of the tree
        }

        // display the nodes of the tree (Root -> Left -> Right)
        void preOrder(Node root) {
            if (root == null) { // if the "current" root is null
                return;
            }

            System.out.print(root.data + " "); // print the "current" root
            preOrder(root.left); // recursive call for the left display of the tree
            preOrder(root.right); // recursive call for the right display of the tree
        }
    }

    public static void main(String[] args) {
        int orders[] = { 1, 2, -1, -1, 3, 4, 6, -1, -1, -1, 5, -1, -1 };
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(orders); // get the root of the binary tree
        tree.preOrder(root); // print the order of the binary tree accordingly
    }
}