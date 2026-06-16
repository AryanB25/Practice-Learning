public class LinkedListCycle {
    private Node head; // stores the head of the linked list

    // constructor
    LinkedListCycle() {
        this.head = null;
    }

    // represents the structure of the node
    class Node {
        private int data; // stores the data of the node
        private Node next; // stores the next node of the current node

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node addFirst(int data) {
        Node newNode = new Node(data); // creates a new node with the data given

        if (head == null) { // if the linked list has no elements
            head = newNode;
            return head;
        }

        Node previousHead = head; // stores the previous head of the list
        head = newNode; // new head of the linked list
        head.next = previousHead; // the next element is the previous head stored

        return head; // return the head of the linked list
    }

    void printNodes() {
        Node currentNode = head; // keeps track of the current node in the list
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> "); // prints the current node
            currentNode = currentNode.next; // traverses the linked list
        }
        System.out.println("NULL"); // prints the null node at the end
    }

    boolean checkCycle() {
        Node fast = head; // fast pointer
        Node slow = head; // slow pointer

        while (fast != null && fast.next != null) {
            fast = fast.next.next; // traverses the list with 2 jumps
            slow = slow.next; // traverses the list with 1 jump
            if (fast == slow) // if the list has a cycle
                return true;
        }
        return false; // the list does not have a cycle
    }

    public static void main(String[] args) {
        LinkedListCycle list = new LinkedListCycle();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.printNodes();
        if (list.checkCycle())
            System.out.println("HAS A CYCLE!");
        else
            System.out.println("DOES NOT HAVE A CYCLE!");
    }
}
