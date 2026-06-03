public class BSTKeySearch {
    // represents the structure of the node
    static class Node {
        private int data; // stores the data of the node
        private Node left; // stores the left node of the current node
        private Node right; // stores the right node of the current node

        // constructor
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node buildTree(Node root, int val) {
        if (root == null) { // if the root is null or we reach the leaf of the BST
            root = new Node(val);
            return root;
        }

        if (root.data > val) { // if the root's value is greater than the given value
            root.left = buildTree(root.left, val); // the value will be on the left
        } else { // if the root's value is lesser than the given value
            root.right = buildTree(root.right, val); // the value will be on the right
        }

        return root; // returns the root of the BST
    }

    static void inOrder(Node root) {
        if (root == null) // if the root is null
            return;
        inOrder(root.left);
        System.out.print(root.data + " "); // print the value of the root
        inOrder(root.right);
    }

    static boolean search(Node root, int val) {
        if (root == null)
            return false;

        if (root.data > val) {
            return search(root.left, val);
        } else if (root.data < val) {
            return search(root.right, val);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int orders[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < orders.length; i++) {
            root = buildTree(root, orders[i]); // create the BST
        }

        inOrder(root); // print the nodes of the BST (In-Order)
        System.out.println();

        if (search(root, 5)) {
            System.out.println("Found!");
        } else {
            System.out.println("NOT Found!");
        }
    }
}
