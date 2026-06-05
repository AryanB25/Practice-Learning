import java.util.ArrayList;

public class BSTRootToLeaf {
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
            root = new Node(val);
            return root;
        }
        if (root.data > val)
            root.left = buildTree(root.left, val);
        else
            root.right = buildTree(root.right, val);
        return root;
    }

    static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void rootPath(Node root, ArrayList<Integer> nums) {
        if (root == null)
            return;
        nums.add(root.data);

        if (root.left == null && root.right == null) {
            printPath(nums);
        } else {
            rootPath(root.left, nums);
            rootPath(root.right, nums);
        }
        nums.remove(nums.size() - 1);
    }

    static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int orders[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < orders.length; i++) {
            root = buildTree(root, orders[i]);
        }

        inOrder(root);
        System.out.println();
        System.out.println("Paths from Root to Leaf: ");
        rootPath(root, new ArrayList<>());
    }
}
