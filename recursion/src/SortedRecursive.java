import java.util.Scanner; // closes the Scanner class

public class SortedRecursive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size; // stores the size of the array
        boolean check; // true or false according to the array (increasing)

        System.out.print("Enter the size of the array: ");
        size = input.nextInt(); // inputs the size of the array

        int arr[] = new int[size]; // stores numbers from the user

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = input.nextInt(); // input the numbers for the array for the current index
        }

        check = sortedRecursion(arr, 0); // calls the function to check the array

        if (check) { // checks if the array is increasing or not
            System.out.println("The Array is INCREASING");
        } else {
            System.out.println("The Array is NOT INCREASING");
        }

        input.close(); // closes the Scanner class
    }

    public static boolean sortedRecursion(int a[], int currIndex) {

        if (a.length == 0) { // checks if its an empty array
            return false;
        }

        if (currIndex >= a.length - 1) { // base case
            return true;
        }

        return a[currIndex] < a[++currIndex] && sortedRecursion(a, ++currIndex); // recursive call
    }
}
