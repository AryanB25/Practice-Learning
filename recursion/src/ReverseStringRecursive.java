import java.util.Scanner; // import the Scanner class

public class ReverseStringRecursive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word; // stores the word from the user

        System.out.print("Enter the word: ");
        word = input.nextLine(); // input the word from the user

        reverseString(word, word.length() - 1); // prints the reversed word
        System.out.println();

        input.close(); // closes the Scanner class
    }

    public static void reverseString(String w, int length) {

        if (length < 0) { // if the number reaches the power, base case
            return;
        }

        System.out.print(w.charAt(length)); // prints the current string at index length
        reverseString(w, --length); // recursive call
    }

}
