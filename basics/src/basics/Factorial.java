package basics;

import java.util.Scanner; // import the Scanner class

public class Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int fact = 1; // declare the variable fact that stores the factorial of the inputted number
        int num; // declare the num variable that stores the number inputted from the user

        System.out.print("Enter a number: ");
        num = input.nextInt(); // input the number from the user

        for (int i = num; i > 0; i--) {
            fact *= i; // updates the fact variable with the current index
        }

        System.out.println("Factorial of " + num + " is " + fact); // prints the factorial of the number

        input.close(); // closes the Scanner class

    }
}
