package Recursion;

public class RemoveCharacterVoidType {
    public static void main(String[] args) {
        skip("", "baccdah");   /// Pass an empty processed string and the full unprocessed string
    }

    static void skip(String p, String up) {

        /// Base case: When the unprocessed string is empty, we are done!

        if (up.isEmpty()) {
            System.out.println(p);   /// Print the final built string right here
            return;
        }

        char ch = up.charAt(0);   /// Look at the first character of the unprocessed part

        if (ch == 'a') {
            skip(p, up.substring(1));  // If it's 'a', skip it: don't add it to 'p', just move to the next char in 'up'
        } else {
            skip(p + ch, up.substring(1));    // If it's not 'a', keep it: add it to 'p', and move to the next char in 'up'
        }
    }
}