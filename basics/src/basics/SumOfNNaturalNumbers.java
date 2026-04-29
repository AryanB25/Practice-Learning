package basics;

import java.util.Scanner; // import the Scanner class

public class SumOfNNaturalNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num; // declare the num variable to store the number n
        int sum = 0; // declare the sum variable to store the sum of n natural numbers

        System.out.print("Enter the number (n): ");
        num = input.nextInt(); // input the number n from the user

        for (int n = 0; n < num; n++) {
            sum += n; // update the sum variable by adding the present natural number
        }

        System.out.println(sum); // print the sum of the n natural numbers

        input.close(); // closes the Scanner class

    }
}
