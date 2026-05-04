import java.util.Scanner; // import the Scanner class 

public class PrintNNaturalRecursion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n; // stores the upper limit

        System.out.print("Enter the number: ");
        n = input.nextInt(); // input the number from the user

        printNumbers(n); // call the method to the print the n natural numbers

        input.close(); // closes the Scanner class
    }

    // function to print n natural numbers
    public static void printNumbers(int num) {
        if (num == 0) { // if the num is 0 (base case)
            return;
        }

        System.out.println(num); // prints the number, num

        printNumbers(--num); // decreases the number by one, recursive call
    }
}
