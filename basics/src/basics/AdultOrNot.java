package basics;

import java.util.Scanner; // import the Scanner class

public class AdultOrNot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age; // declare a variable "age" to store the age of the user

        System.out.print("Enter your AGE: "); 
        age = input.nextInt(); // input the age of the user

        if (age >= 18) { // checks if the user's age is equal to or above 18
            System.out.println("Your are an ADULT.");
        } else { // if the age of the user is below 18
            System.out.println("Your are NOT an adult.");
        }

        input.close(); // closes the Scanner class

    }
}
