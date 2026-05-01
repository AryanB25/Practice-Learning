package basics;

import java.util.Scanner; // import the Scanner class

public class CourseAndGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size; // declares the num variable which will store the number of courses

        System.out.print("Enter the number of courses: ");
        size = input.nextInt(); // inputs the number of courses

        String names[] = new String[size]; // string array that will store the course's name
        int marks[] = new int[size]; // integer array that will store the marks of the course

        input.nextLine();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the name of course " + (i + 1) + ": ");
            names[i] = input.nextLine(); // inputs the name of the courses
        }

        for (int j = 0; j < names.length; j++) {
            System.out.print("Enter the marks for your " + names[j] + " course: ");
            marks[j] = input.nextInt(); // inputs the marks of the courses according to the name
        }

        System.out.println("\t\t\t\t\t\t\tFinal Marks"); // header for aesthetics

        for (int m = 0; m < names.length; m++) {
            System.out.println(names[m] + ": " + marks[m]); // prints the courses and the grades
        }

        input.close(); // closes the Scanner class

    }
}
