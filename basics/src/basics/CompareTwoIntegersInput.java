package basics;

import java.util.Scanner; // import the Scanner class

public class CompareTwoIntegersInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1; // declare the num1 variable for storing the first number
        int num2; // declare the num2 variable for storing the second number

        System.out.print("Enter your FIRST number: ");
        num1 = input.nextInt(); // input the first number from the user
        System.out.print("Enter your SECOND number: ");
        num2 = input.nextInt(); // input the second number from the user

        if (num1 == num2) { // if both the numbers are equal
            System.out.println("Both the numbers are equal!");
        } else if (num1 > num2) { // if the first number is greater than the second
            System.out.println(num1 + " is greater than " + num2);
        } else { // if the second number is greater than the first
            System.out.println(num2 + " is greater than " + num1);
        }

        input.close(); // closes the Scanner class

    }
}
