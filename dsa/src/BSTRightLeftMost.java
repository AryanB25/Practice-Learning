public class BSTRightLeftMost {

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
        if (root == null) {
            // if the tree is empty or we reach the leaf
            root = new Node(val);
            return root;
        }

        if (root.data > val) // if the root value is greater than the value given
            root.left = buildTree(root.left, val);
        if (root.data < val) // if the root value is less than the value given
            root.right = buildTree(root.right, val);

        return root; // return the root of the tree
    }

    static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static int rightMost(Node root) {
        while (root.right != null) { // right traversal of the BST
            root = root.right;
        }
        return root.data; // return the right most node of the BST
    }

    static int leftMost(Node root) {
        while (root.left != null) { // left traversal of the BST
            root = root.left;
        }
        return root.data; // return the left most node of the BST
    }

    public static void main(String[] args) {
        int orders[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < orders.length; i++) {
            root = buildTree(root, orders[i]);
        }

        inOrder(root);
        System.out.println();
        System.out.println("Right Most Node: " + rightMost(root));
        System.out.println("Left Most Node: " + leftMost(root));
    }
}
