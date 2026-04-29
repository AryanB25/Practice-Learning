package basics;

import java.util.Scanner; // import the Scanner class

public class GreetingsUsingSwitchCase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice; // declare the choice variable to store the user's choice

        System.out.print("Enter your choice (1, 2 or 3): ");
        choice = input.nextInt(); // inputs the user's choice

        switch (choice) {
            case 1: // if choice is the value 1
                System.out.println("Hello!");
                break;
            case 2: // if choice is the value 2
                System.out.println("Bonjour!");
                break;
            case 3: // if choice is the value 3
                System.out.println("Nihao!");
                break; 
            default: // if the choice is anything else
                System.out.println("Invalid option! Choose a number 1, 2, or 3.");
        }

        input.close(); // closes the Scanner class

    }
}
