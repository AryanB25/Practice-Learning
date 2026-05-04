import java.util.Scanner; // import the Scanner class

public class FibonacciRecursive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int limit; // stores the upper limit
        int prev = 0; // stores the previous number in the series

        System.out.print("Enter the number: ");
        limit = input.nextInt(); // input the number from the user

        System.out.print("0 ");
        fibonacciPrint(1, prev, limit); // call the method to the print fibonacci series till the limit
        System.out.println();

        input.close(); // closes the Scanner class
    }

    public static void fibonacciPrint(int num, int previous, int limit) {

        if (num == limit) { // if the number reaches the limit, base case
            return;
        }

        System.out.print(num + " "); // print the next number in the series
        fibonacciPrint(previous + num, num, limit); // recursive call
    }
}
