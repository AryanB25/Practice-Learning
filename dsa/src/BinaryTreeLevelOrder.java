import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrder {

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

        Node buildTree(int[] orders) {
            index++; // current index

            if (orders[index] == -1) { // if we reach a leaf of the tree
                return null;
            }

            Node newNode = new Node(orders[index]);
            newNode.left = buildTree(orders);
            newNode.right = buildTree(orders);

            return newNode; // returns the root of the tree
        }

        void levelOrder(Node root) {
            if (root == null) // if the tree has no nodes
                return;

            Queue<Node> nodes = new LinkedList<>(); // stores the nodes of the tree
            nodes.add(root);
            nodes.add(null); // acts as a barrier for each level

            while (!nodes.isEmpty()) { // until the list has nodes in it
                Node currentNode = nodes.remove(); // extract the current node
                if (currentNode == null) {
                    if (nodes.isEmpty()) { // if there aren't any nodes left
                        break;
                    } else {
                        nodes.add(null); // add the null to the end of the list
                                         // for the next level
                        System.out.println();
                    }
                } else {
                    System.out.print(currentNode.data + " "); // print the value of the node
                    if (currentNode.left != null) { // if the current node has a left node
                        nodes.add(currentNode.left); // adds the left node to the list
                    }
                    if (currentNode.right != null) { // if the current node has a right node
                        nodes.add(currentNode.right); // adds the right node to the list
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int orders[] = { 1, 2, -1, -1, 3, 4, 6, -1, -1, -1, 5, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(orders);
        tree.levelOrder(root); // each node printed according to their level
    }
}
