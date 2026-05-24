public class BinaryTreeInOrder {

    // represents the structure of the node
    static class Node {
        private int data; // stores the data of the node
        private Node left; // stores the left node to the current node
        private Node right; // stores the right node to the current node

        // constructor
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // represents the structure of a binary tree
    static class BinaryTree {
        private int index = -1;

        Node buildTree(int[] orders) {
            index++; // current index

            if (orders[index] == -1) { // if we reach a leaf of the tree
                return null;
            }

            Node newNode = new Node(orders[index]);
            newNode.left = buildTree(orders);
            newNode.right = buildTree(orders);

            return newNode; // returns the root of the binary tree
        }

        void inOrder(Node root) {
            if (root == null) { // if the node has no children
                return;
            }

            inOrder(root.left); // recursive call to get the left side of the tree
            System.out.print(root.data + " ");
            inOrder(root.right); // recursive call to get the right side of the tree
        }
    }

    public static void main(String[] args) {
        int orders[] = { 1, 2, -1, -1, 3, 4, 6, -1, -1, -1, 5, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(orders);
        tree.inOrder(root);
    }
}
