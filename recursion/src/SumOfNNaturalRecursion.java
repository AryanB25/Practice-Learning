import java.util.Scanner; // import the Scanner class

public class SumOfNNaturalRecursion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n; // stores the upper limit

        System.out.print("Enter the number: ");
        n = input.nextInt(); // input the number from the user

        System.out.println("Sum: " + printSum(n)); // call the method to the print the sum of n natural numbers

        input.close(); // closes the Scanner class
    }

    // function to print n natural numbers
    public static int printSum(int num) {
        if (num == 0) { // if the num is 0 (base case)
            return 0;
        }

        return num + printSum(--num); // prints the sum of n natural numbers
    }
}
