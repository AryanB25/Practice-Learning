package basics;

import java.util.Scanner; // import the Scanner class

public class LinearSearch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size; // size of the array
        int x; // stores the integer to be searched in the array
        boolean check = false; // checks if the element is even in the array

        System.out.print("Enter the number of integers: ");
        size = input.nextInt(); // input the size of the array

        int a[] = new int[size]; // array storing the numbers inputted by the user

        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (1 + i) + ": ");
            a[i] = input.nextInt(); // input the integers into the array
        }

        System.out.print("Enter the number you want to search: ");
        x = input.nextInt(); // input the number that's being searched

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) { // if the number is equal to the current element of the array
                System.out.println("Number found at position " + (i + 1));
                check = true;
            }
        }

        if (!check) { // if the input is invalid
            System.out.println("Number not found in Array!!");
        }

        input.close(); // closes the Scanner class
    }
}
