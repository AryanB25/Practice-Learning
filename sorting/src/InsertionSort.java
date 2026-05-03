import java.util.Scanner; // import the Scanner class

public class InsertionSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size; // size of the array
        int currentValue; // current value of the array
        int j; // holds the value i - 1

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

        // Insertion sorting algorithm

        for (int i = 1; i < nums.length; i++) {
            currentValue = nums[i];
            j = i - 1;

            while (j >= 0 && currentValue < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = currentValue;
        }

        System.out.println("Array after sorting using insertion sort: ");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]); // prints the array after sorting
        }

        input.close(); // closes the Scanner class
    }

}
