public class LinkedListDeleteLast {

    private Node head; // stores the head node of the linked list

    // constructor
    LinkedListDeleteLast() {
        this.head = null;
    }

    // node of the linked list (structure)
    class Node {
        private String data; // stores the data for the node
        private Node next; // stores the next node

        // constructor
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // adds a node to the start of the linked list
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    // deletes the first node from the linked list
    public void deleteLast() {

        if (head == null) { // if the linked list is empty
            System.out.println("The list is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node currentNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            currentNode = currentNode.next;
            lastNode = lastNode.next;
        }

        currentNode.next = null;
    }

    // function to print the nodes of the linked list
    public void printNodes() {
        Node currentNode = head; // current node is the head

        while (currentNode != null) { // till the end of the linked list
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next; // traverse the linked list
        }

        System.out.print("NULL");
    }

    public static void main(String[] args) {
        LinkedListDeleteLast list = new LinkedListDeleteLast();

        list.addLast("A");
        list.addLast("B");
        list.deleteLast(); // deletes the first node "B"

        list.printNodes(); // calls the function to print the nodes
    }
}
