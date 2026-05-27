public class BinaryTreeComplete {

    // represents the structure of the node
    static class Node {
        private int data; // stores the data of the node
        private Node left; // stores the left node of the node
        private Node right; // stores the right node of the node

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
            newNode.right = buildTree(orders);
            newNode.left = buildTree(orders);

            return newNode; // returns the root of the tree
        }

        // prints the binary tree in preOrder
        void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // prints the binary tree in inOrder
        void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // prints the binary tree in postOrder
        void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // returns the number of nodes
        int countNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int leftCount = countNodes(root.left);
            int rightCount = countNodes(root.right);

            return leftCount + rightCount + 1;
        }

        // returns the height of the binary tree
        int heightNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = heightNodes(root.left);
            int rightHeight = heightNodes(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        // returns the sum of the nodes in the binary tree
        int sumNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = sumNodes(root.left);
            int rightSum = sumNodes(root.right);

            return root.data + rightSum + leftSum;
        }
    }

    public static void main(String[] args) {
        int orders[] = { 1, 2, -1, -1, 3, 4, 6, -1, -1, -1, 5, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(orders);
        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
        System.out.println("Sum of Nodes: " + tree.sumNodes(root));
        System.out.println("Number of Nodes: " + tree.countNodes(root));
        System.out.println("Height: " + tree.heightNodes(root));
    }
}
