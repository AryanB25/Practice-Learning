package basics;

import java.util.Scanner; // import the Scanner class

public class PrintUserFirstAndLastName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstName; // declare the firstName variable to store the user's first name
        String lastName; // declare the lastName variable to store the user's last name

        System.out.print("Enter your FIRST name: ");
        firstName = input.nextLine(); // input the first name of the user
        System.out.print("Enter your LAST name: ");
        lastName = input.nextLine(); // input the last name of the user

        System.out.println(firstName + " " + lastName); // prints the first and last name of the user

        input.close(); // closes the Scanner class
    }
}
