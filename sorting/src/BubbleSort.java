import java.util.Scanner; // import the Scanner class 

public class BubbleSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size; // size of the array
        int temp; // temp variable to store values when swapping

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

        // Bubble sorting algorithm (Ascending)

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // swap
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println("Array after sorting (Ascending): ");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]); // prints the array after sorting in ascending order
        }

        // Bubble sorting algorithm (Descending)

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    // swap
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println("Array after sorting (Descending): ");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]); // prints the array after sorting in descending order
        }

        input.close(); // closes the Scanner class
    }
}