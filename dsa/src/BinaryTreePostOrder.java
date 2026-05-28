public class BinaryTreePostOrder {

    // represents the structure of a node
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

    static class BinaryTree {
        private int index = -1; // store the current index

        Node buildTree(int[] orders) {
            index++; // current index

            if (orders[index] == -1) { // if we reach the leaf of the tree
                return null;
            }

            Node newNode = new Node(orders[index]);
            newNode.left = buildTree(orders); // recursive call for the left of the tree
            newNode.right = buildTree(orders); // recursive call for the right of the tree

            return newNode; // returns the root of the tree
        }

        void postOrder(Node root) {
            if (root == null) { // if we reach the leafs of the tree
                return;
            }

            postOrder(root.left); // recursive call to the left of the tree
            postOrder(root.right); // recursive call to the right of the tree
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        int orders[] = { 1, 2, -1, -1, 3, 4, 6, -1, -1, -1, 5, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(orders);
        tree.postOrder(root);
    }
}
