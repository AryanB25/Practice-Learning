public class StackAsLinkedList {

    private Node head; // stores the head of the linked list

    // constructor
    StackAsLinkedList() {
        this.head = null;
    }

    class Node {
        private int data; // stores the data of the current node
        private Node next; // stores the next node of the current node

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int val) {
        Node newNode = new Node(val);
        if (head == null) { // if the stack is empty
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode; // head becomes the current node added
        }
    }

    public void pop() {
        head = head.next; // removes the first element of the stack
    }

    public int peek() {
        if (head == null) {
            return -1;
        } else {
            return head.data; // returns the top element of the stack
        }
    }

    public boolean isEmpty() {
        return head == null; // checks if the stack is empty or not
    }

    public static void main(String[] args) {
        StackAsLinkedList stack = new StackAsLinkedList();

        stack.push(2);
        stack.push(3);
        stack.push(6);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek()); // prints the top most element of the stack
            stack.pop();
        }

        System.out.println(stack.peek()); // prints the top element of the stack '-1'
    }
}
