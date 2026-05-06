public class LinkedListAddLast {

    private Node head; // stores the head of the linked list

    // constructor
    LinkedListAddLast() {
        this.head = null;
    }

    class Node {
        private String data; // stores the data of the node
        private Node next; // stores the next value of the current node

        // constructor
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // function to add node to the end of the linked list
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head; // current node, starts from the head

        while (current.next != null) {
            current = current.next; // traverse the nodes of the linked list
        }

        current.next = newNode; // next node after the last node (originally)
    }

    // prints the nodes
    public void printNodes() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.print("NULL");
    }

    public static void main(String[] args) {

        LinkedListAddLast list = new LinkedListAddLast();

        // adding the values to the end of the linked list
        list.addLast("A");
        list.addLast("b");
        list.addLast("C");

        list.printNodes(); // prints the nodes of the linked list

    }
}
