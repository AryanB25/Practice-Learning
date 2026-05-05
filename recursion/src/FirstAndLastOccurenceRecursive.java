import java.util.Scanner; // import the Scanner class

public class FirstAndLastOccurenceRecursive {

    static int first = -1; // stores the first occurence of the character
    static int last = -1; // stores the last occurence of the character

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word; // stores the user's word
        char charWord; // stores the character we want to find

        System.out.print("Enter a word: ");
        word = input.nextLine(); // inputs the word from the user

        System.out.print("Enter a character: ");
        charWord = input.next().charAt(0); // inputs the character from the user

        firstAndLastOccurence(word, charWord, 0); // calls the method

        System.out.println("First occurence of '" + charWord + "': " + first);
        System.out.println("Last occurence of '" + charWord + "': " + last);

        input.close(); // closes the Scanner class

    }

    // function to find the first and last occurence of a character in the word
    public static void firstAndLastOccurence(String word, char c, int currIndex) {

        if (currIndex == word.length()) { // base case
            return;
        }

        if (word.charAt(currIndex) == c) {
            if (first == -1 && word.charAt(currIndex) == c) { // first occurence found
                first = currIndex;
            } else {
                last = currIndex;
            }
        }

        firstAndLastOccurence(word, c, ++currIndex); // recursive call
    }
}
