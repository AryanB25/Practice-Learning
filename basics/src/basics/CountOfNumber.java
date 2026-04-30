package basics;

import java.util.Scanner; // import the Scanner class

public class CountOfNumber {

    // fields used across multiple methods

    private static int countPositive;
    private static int countNegative;
    private static int countZero;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean check = true; // declare the check variable, which will run the loop until its false
        int num; // declare the num variable to input the number from the user
        char choice; // declare the choice variable to get the user's choice

        do {

            System.out.print("Enter a number: ");
            num = input.nextInt();
            countInt(num);
            System.out.println("Would you like to continue? (y for yes or n for no) ");
            choice = input.next().charAt(0);

            if (choice == 'N' || choice == 'n') {
                check = false;
            }

        } while (check);

        displayInt(); // displays the stats for all types of integers after the end

        input.close(); // closes the Scanner class

    }

    private static void countInt(int number) { // method to count respective categories of the integer

        if (number > 0) { // if the integer is positive
            countPositive++;
        } else if (number < 0) { // if the integer is negative
            countNegative++;
        } else if (number == 0) { // if the integer is 0
            countZero++;
        }

    }

    private static void displayInt() { // method to display the respective categories of the integer

        System.out.println("Positive Numbers: " + countPositive);
        System.out.println("Negative Numbers: " + countNegative);
        System.out.println("Number of Zeroes: " + countZero);

    }

}
