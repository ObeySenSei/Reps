package Recursion.SubsetsSubsequenceStringQuestions;

public class RemoveCharacterReturnType {
    public static void main(String[] args) {
        String str = "baccdah";
        System.out.println(removeChar(str));

    }
    static String removeChar(String str){

        if (str.isEmpty()){              /// Base case: If the string is empty, we are done
            return "";
        }
        char firstChar = str.charAt(0);     /// Look at the first character

        if (firstChar == 'a'){
            return removeChar(str.substring(1));  // If it is 'a', skip it and process the rest of the string
        } else {
            return firstChar + removeChar(str.substring(1));  // If it is not 'a', keep it and combine it with the processed rest of the string
        }
    }
}
/**

 Deferred Computation (What you just wrote): Right-to-left on the way back up
 You strip away characters on the way down, pausing and waiting at every step.
 The actual string concatenation only happens after you hit the base case, as the call stack pops and pieces everything
 back together in reverse order.

 Accumulator Pattern: Left-to-right on the way down
 You carry a running result string with you as you dive deeper into the stack.
 By the time you hit the base case, the final string is already fully built.

 */