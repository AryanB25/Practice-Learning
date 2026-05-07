public class ReverseALinkedListIterative {
    private Node head; // head of the linked list

    // constructor
    ReverseALinkedListIterative() {
        this.head = null;
    }

    class Node {
        private Node next; // stores the next node of the current node
        private int data; // data the node stores

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        // 2 -> 3 -> 4 -> null
        // 1
        // 1 (head) -> 2 (next) -> 3 -> 4 -> null

        newNode.next = head; // next node becomes the head
        head = newNode; // head is the new node
    }

    public void printNodes() {

        Node currentNode = head; // starts at the head of the linked list

        while (currentNode != null) { // till the end of the linked list
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next; // traverse the linked list
        }

        System.out.println("NULL");
    }

    public Node reverseLinked(Node head) {
        Node previousNode = null; 
        // 3 -> 2 -> 0 -> NULL
        // NULL <- 3 <- 2 <- 0
        // operation in terms of 3 segments
        // previous, current, next
        // 1. current = 3 
        //    next = null (node)
        //    prev = current (head)
        // repeat the process by moving 1 right until null 

        while (head != null) {
            Node storePreviousNextNode = head.next;
            head.next = previousNode; 
            previousNode = head; 
            head = storePreviousNextNode; 
        }
        return previousNode; // returning the head of the reversed linked list
    }

    public static void main(String[] args) {
        ReverseALinkedListIterative list = new ReverseALinkedListIterative();
        // NULL
        list.addFirst(0);
        // 0 -> NULL
        list.addFirst(2);
        // 2 -> 0 -> NULL
        list.addFirst(3);
        // 3 -> 2 -> 0 -> NULL
        list.printNodes(); // print the formatted linked list

        list.head = list.reverseLinked(list.head); // reverse the linked list
        list.printNodes(); // print the formatted linked list
    }
}
