package basics;

import java.util.Scanner; // import the Scanner class

public class PrintUserFirstAndLastName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.print("Enter your FIRST name: ");
        firstName = input.nextLine(); // input the first name of the user
        System.out.print("Enter your LAST name: ");
        lastName = input.nextLine(); // input the last name of the user

        System.out.println(firstName + " " + lastName); // prints the first and last name of the user

        input.close(); // closes the Scanner class
    }
}
