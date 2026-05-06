public class LinkedListDeleteFirst {

    private Node head; // stores the head node of the linked list

    // constructor
    LinkedListDeleteFirst() {
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
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // deletes the first node from the linked list
    public void deleteFirst() {
        if (head == null) { // if the linked list is empty
            System.out.println("The list is empty");
            return;
        }

        head = head.next; // "new" head is the next of the original head
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
        LinkedListDeleteFirst list = new LinkedListDeleteFirst();

        list.addFirst("A");
        list.addFirst("B");
        list.deleteFirst(); // deletes the first node "B"
        
        list.printNodes(); // calls the function to print the nodes
    }
}
