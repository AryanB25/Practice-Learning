package basics;

public class StringBuild {
    
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Aryan"); // new string "Aryan"

        // get the first character from the string 
        System.out.println(sb.charAt(0));

        // set the first character of the string to be "F"
        sb.setCharAt(0, 'F');

        System.out.println(sb.charAt(0));
        System.out.println(sb);

        // insert a 'w' at the 2nd index of the string

        sb.insert(2, 'w');

        System.out.println(sb.charAt(2));
        System.out.println(sb);

        //remove the 'w' from the 2nd index of the string
        sb.delete(2, 3);

        System.out.println(sb.charAt(2));
        System.out.println(sb);
        
        // reverse the string
        sb.reverse(); 
        System.out.println(sb);

    }
}
