public class BinaryTreeHeight {

    // represents the structure of the node
    static class Node {
        private int data; // stores the data of the node
        private Node right; // stores the right node of the current node
        private Node left; // stores the left node of the current node

        // constructor
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // represents the structure of the binary tree
    static class BinaryTree {
        private int index = -1; // stores the current index

        Node buildTree(int orders[]) {
            index++; // current index

            if (orders[index] == -1) { // if we reach the leaf of the tree
                return null;
            }

            Node newNode = new Node(orders[index]);
            newNode.left = buildTree(orders);
            newNode.right = buildTree(orders);

            return newNode; // returns the root of the binary tree
        }

        int heightNode(Node root) {
            if (root == null) { // base case
                return 0;
            }

            int leftHeight = heightNode(root.left); // calculates the height of the left tree
            int rightHeight = heightNode(root.right); // calculates the height of the right tree

            return Math.max(leftHeight, rightHeight) + 1; // returns the height of the tree
        }
    }

    public static void main(String[] args) {
        int orders[] = { 1, 2, -1, -1, 3, 4, 6, -1, -1, -1, 5, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(orders);
        System.out.println(tree.heightNode(root)); // prints the height of the tree
    }
}
