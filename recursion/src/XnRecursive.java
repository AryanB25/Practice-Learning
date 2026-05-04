import java.util.Scanner; // import the Scanner class

public class XnRecursive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int power; // stores the upper limit
        int baseNum; // stores the base number

        System.out.print("Enter the limit: ");
        power = input.nextInt(); // input the limit power from the user

        System.out.print("Enter the base number: ");
        baseNum = input.nextInt(); // input the base number from the user

        System.out.println("Sum: " + xNPrint(baseNum, power)); // call the method to the print the sum of x^n to n = 0

        input.close(); // closes the Scanner class
    }

    public static int xNPrint(int num, int power) {

        if (power == 0) { // if the number reaches the power, base case
            return 1;
        }

        return (int) Math.pow(num, power) + xNPrint(num, --power); // recursive call
    }
}
