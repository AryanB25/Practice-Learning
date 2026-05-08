public class DeleteNthNode {
    private Node head; // stores the head of the linked list

    // constructor
    DeleteNthNode() {
        this.head = null;
    }

    class Node {
        private Node next; // stores the next node of the current node
        private int data; // stores the data of the current node

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head; // the head is the next node of the new node
        head = newNode; // the new head is the newNode
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head; // start from the head of the linked list

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode; // add the new node to the end of the linked list
    }

    public void printNodes() {
        Node currentNode = head; // start from the head of the node

        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next; // traverse to the end of the linked list
        }

        System.out.println("NULL");
    }

    public void deleteNth(Node head, int n) {
        // two pointers starting from the head
        Node fast = head;
        Node slow = head;

        while (n != 0) {
            fast = fast.next; // give the fast pointer a n jump start
            n--;
        }

        while (fast.next != null) { // until we reach the last element before null
            // traverse the two pointers accordingly
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next; // deletes the specific element (breaking connection)
    }

    public boolean isPalindrome() {
        // two pointers for if its a palindrome
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next; // hare jumps of 2
            slow = slow.next; // turtle jumps of 1
        }

        fast = head;
        slow = reversedNodes(slow); // the second half of the linked list (reversed)

        while (slow != null) {
            if (slow.data != fast.data) { // if its not a palindrome
                return false;
            }
            // traverse the two pointers through the linked list
            fast = fast.next;
            slow = slow.next;
        }

        return true; // the linked list is a palindrome
    }

    public Node reversedNodes(Node head) {
        Node previousNode = null; // previous node of the current node

        while (head != null) {
            Node nextNode = head.next;
            head.next = previousNode;
            previousNode = head;
            head = nextNode;
        }

        return previousNode; // returns the reversed linked list
    }

    public static void main(String[] args) {
        DeleteNthNode list = new DeleteNthNode();
        list.addFirst(1);
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(1);

        list.printNodes(); // print the nodes of the linked list

        list.deleteNth(list.head, 2); // delete the 2nd element from the end
        list.printNodes();

        if (list.isPalindrome()) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT A PALINDROME");
        }
    }

}