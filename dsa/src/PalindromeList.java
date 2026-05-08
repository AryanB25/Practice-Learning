public class PalindromeList {

    private Node head; // stores the head of the linked list

    // constructor
    PalindromeList() {
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

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head; // start from the head of the list

        while (currentNode.next != null) {
            currentNode = currentNode.next; // traversing the linked list
        }

        currentNode.next = newNode; // add the new node to the end of the list
    }

    public void printNodes() {
        Node currentNode = head; // start from the head of the list

        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next; // traverse the linked list
        }

        System.out.println("NULL");
    }

    public boolean isPalindrome(Node head) {

        Node fast = head;
        Node slow = head;

        // fast makes increments or jumps of 2 compared to the slow of 1

        while (fast != null && fast.next != null) {
            fast = fast.next.next; // hare jumps by 2
            slow = slow.next; // tortoise jumps by 1
        }

        fast = head; // start from the head of the linked list
        slow = reversedList(slow); // reverse the other half of the list

        while (fast != null) {
            if (fast.data != slow.data) { // if not a palindrome
                return false;
            }
            fast = fast.next; // traversing the first half of the list
            slow = slow.next; // traversing the second half of the list
        }

        return true; // the linked list is a palindrome
    }

    // algorithm to reverse the linked list
    public Node reversedList(Node head) {
        Node previousNode = null;

        while (head != null) {
            Node nextNode = head.next;
            head.next = previousNode;
            previousNode = head;
            head = nextNode;
        }

        return previousNode;
    }

    public static void main(String[] args) {
        PalindromeList list = new PalindromeList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(1);

        list.printNodes();

        if (list.isPalindrome(list.head)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT A PALINDROME");
        }
    }
}
