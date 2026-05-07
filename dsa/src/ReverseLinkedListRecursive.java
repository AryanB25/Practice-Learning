public class ReverseLinkedListRecursive {

    private Node head; // stores the head of the linked list

    // constructor
    ReverseLinkedListRecursive() {
        this.head = null;
    }

    class Node {
        private int data; // stores the data for the node
        private Node next; // stores the next node of the current node

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) { // if the linked list is empty
            head = newNode; // head of the linked list
            return;
        }

        Node currentNode = head; // start from the head

        while (currentNode.next != null) {
            currentNode = currentNode.next; // traverse the linked list
        }

        currentNode.next = newNode; // the node is added to the end of the linked list
    }

    public void printNodes() {
        Node currentNode = head; // start from the head

        while (currentNode != null) { // till the end of the linked list
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next; // traverse the linked list
        }

        System.out.println("NULL");
    }

    public Node reverseList(Node head) {

        if (head == null || head.next == null) {
            return head; // base case
        }

        Node reversedNode = reverseList(head.next); // recursive call
        head.next.next = head; // reverse the relationship arrow
        head.next = null;
        return reversedNode; // return the new head of the reversed linked list
    }

    public static void main(String[] args) {
        ReverseLinkedListRecursive list = new ReverseLinkedListRecursive();
        list.addLast(2);
        list.addLast(3);
        list.addLast(1);

        list.printNodes();

        list.head = list.reverseList(list.head); // call to the function to reverse the list
        list.printNodes();
    }
}
