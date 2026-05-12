import java.util.ArrayList;

public class StackAsArrayList {

    private ArrayList<Integer> arrList; // array list that stores the elements

    // constructor
    StackAsArrayList() {
        arrList = new ArrayList<>();
    }

    public void push(int data) {
        arrList.add(data); // add the element to the stack
    }

    public void pop() {
        arrList.remove(arrList.size() - 1); // remove the top most element of the stack
    }

    public int peek() {
        if (arrList.isEmpty()) { // if the list is empty
            return -1;
        } else {
            return arrList.get(arrList.size() - 1); // returns the top most element of the stack
        }
    }

    public boolean isEmpty(ArrayList<Integer> arr) {
        return arr.size() == 0; // if the stack is empty or not
    }

    public static void main(String[] args) {
        StackAsArrayList list = new StackAsArrayList();
        list.push(0);
        list.push(2);
        list.push(3);

        System.out.println(list.peek()); // peek at the top most element of the stack

        list.pop(); // pop the top most element of the stack

        System.out.println(list.peek());
    }

}
