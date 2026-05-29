public class SubtreeofATree {

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

            return newNode; // returns the root of the tree
        }

        void inOrder(Node root) {
            if (root == null) { // if we reach the leaf of the tree
                return;
            }

            inOrder(root.left); // recursive call to the left of the root
            System.out.print(root.data + " "); // prints the current root data
            inOrder(root.right); // recursive call to the right of the root
        }

        boolean equalRoot(Node root, Node subRoot) {
            if (subRoot == null)
                return true;
            if (root == null)
                return false;
            if (checkEqual(root, subRoot))
                return true;
            return equalRoot(root.right, subRoot) || equalRoot(root.left, subRoot);
        }

        boolean checkEqual(Node root, Node subRoot) {
            if (root == null && subRoot == null)
                return true;
            if (root == null || subRoot == null)
                return false;
            if (root.data != subRoot.data)
                return false;
            return checkEqual(root.left, subRoot.left) && checkEqual(root.right, subRoot.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int orders[] = { 1, 2, -1, -1, 3, 4, 6, -1, -1, -1, 5, -1, -1 };
        int subTree[] = { 3, 4, 6, -1, -1 };
        Node root = tree.buildTree(orders);
        Node subRoot = tree.buildTree(subTree);
        tree.inOrder(root);
        tree.inOrder(subRoot);
        System.out.println(tree.equalRoot(root, subRoot)); 
    }
}
