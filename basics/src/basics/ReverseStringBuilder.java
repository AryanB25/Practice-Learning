package basics;

import java.util.Scanner; // import the Scanner class

public class ReverseStringBuilder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str; // stores the user's string
        int front; // stores the front index
        int back; // stores the back index
        char frontChar; // stores the character for the front position
        char backChar; // stores the character for the back position

        System.out.print("Enter a string: ");
        str = input.nextLine(); // inputs the string from the user

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length() / 2; i++) {
            front = i; // front position
            back = sb.length() - 1 - i; // back position

            frontChar = sb.charAt(front); // character at the front position
            backChar = sb.charAt(back); // character at the back position

            sb.setCharAt(front, backChar); // sets the last character in the front position
            sb.setCharAt(back, frontChar); // sets the first character in the back position
        }

        System.out.println(sb); // prints the reversed string

        input.close(); // closes the Scanner class
    }
}
