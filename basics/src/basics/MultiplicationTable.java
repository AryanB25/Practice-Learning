package basics;

import java.util.Scanner; // imports the Scanner class

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num; // declares the num variable to store the number for the multiplication table

        System.out.print("Enter the number: ");
        num = input.nextInt(); // inputs the required number from the user

        for (int i = 1; i < 11; i++) {
            System.out.println(num + "x" + i + " = " + (i * num)); // prints the multiplication table
        }

        input.close(); // closes the Scanner class
    }
}
