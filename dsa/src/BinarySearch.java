import java.util.Scanner; // calls the Scanner class

public class BinarySearch {

    static boolean isPresent(int arr[], int target) {
        int start = 0; // stores the starting index
        int end = arr.length - 1; // stores the ending index
        int mid; // stores the middle index

        while (start <= end) {
            mid = (start + end) / 2; // finds the middle index
            if (arr[mid] == target) // if the target is found
                return true; // the target value has been found
            if (arr[mid] < target) { // if the target value is greater than the middle value
                start = mid + 1; // the starting index is moved to the right side
            } else { // if the target value is lesser than the middle value
                end = mid - 1; // the ending index is moved to the left side
            }
        }
        return false; // the target value was not found
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size; // stores the size of the array (number of integers)
        int target; // stores the target integer to find

        System.out.print("Enter the number of integers: ");
        size = input.nextInt(); // inputs the size of the array

        int arr[] = new int[size]; // declare the array of integers

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Integer " + (i + 1) + ": ");
            arr[i] = input.nextInt(); // inputs the integers for the array
        }

        System.out.print("Enter the target integer to find: ");
        target = input.nextInt(); // inputs the target integer

        if (isPresent(arr, target)) // if the element is present in the array
            System.out.println(target + " was FOUND!");
        else
            System.out.println(target + " was NOT FOUND!");

        input.close(); // closes the Scanner class
    }
}
