import java.util.LinkedList; // import the Linked list class

public class LinkedListCollections {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1); // add 1 to the linked list
        list.addFirst(2); // add 2 to the start of the linked list
        list.addLast(3); // add 3 to the end of the linked list

        System.out.println(list);

        list.remove(2); // remove the last element in this linked list
        System.out.println(list);

        list.add(2); // add 2 to the list (end)
        list.removeFirst(); // remove the first number or element of the list
        System.out.println(list);

        list.removeLast(); // remove the last element of the list
        System.out.println(list);
    }
}
