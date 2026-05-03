import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size; // size of the array
        int shorterIndex; // variable to store shortest index when swapping

        System.out.print("Enter the size of the array: ");
        size = input.nextInt(); // input the size of the array from the user

        int nums[] = new int[size]; // array to store numbers from the user

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = input.nextInt(); // input the number for index i
        }

        System.out.println("Array before sorting: ");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]); // prints the original array before sorting
        }

        // Selection sorting algorithm

        for (int i = 0; i < nums.length - 1; i++) {
            shorterIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[shorterIndex] > nums[j]) {
                    shorterIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[shorterIndex];
            nums[shorterIndex] = temp;
        }

        System.out.println("Array after sorting using selection sort: ");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]); // prints the array after sorting in ascending order
        }

        input.close(); // closes the Scanner class
    }
}
