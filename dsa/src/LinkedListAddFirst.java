public class LinkedListAddFirst {

    private Node head; // stores the head of the linked list

    // constructor
    public LinkedListAddFirst() {
        this.head = null;
    }

    class Node {
        private String data; // stores the data for the node
        private Node next; // stores the next node

        // constructor
        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {

        Node newNode = new Node(data);

        newNode.next = head; // the next node is the current head
        head = newNode; // the head is now the new node added

    }

    public void printAllNodes() {

        Node current = head; // current node = head

        while (current != null) { // runs till it reaches the last node
            System.out.print(current.data + " -> ");
            current = current.next; // traverse the nodes
        }

        System.out.print("NULL");

    }

    public static void main(String[] args) {

        LinkedListAddFirst list = new LinkedListAddFirst();

        // added these to the linked list (nodes created)
        list.addFirst("Aryan");
        list.addFirst("A");
        list.addFirst("b");

        list.printAllNodes(); // prints all the nodes in the linked list

    }
}