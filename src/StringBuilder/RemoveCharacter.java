package StringBuilder;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "baanana";
        char target = 'a';
        String ans = removeChar(str,target);
        System.out.println("The ans: " + ans );
    }
    static String removeChar(String str,char target){

        StringBuilder sb = new StringBuilder (str);

        for (int index = 0; index <= sb.length()- 1; index++) {
            if (sb.charAt(index) == target) {
                sb.deleteCharAt(index);               // this calls the method of StringBuilder like Reverse
                index--;
            }
        }
        String ans = sb.toString();       // converts the SB back to string so that we can return it.
        return ans;
    }
}
/*
For strings str.charAt(0) returns the first character's numeric value. For "banana", that's 'b', whose value is 98.

return type is String, but sb is a StringBuilder. This won't compile because the method promises to return a String.
Convert it using: return sb.toString();

deleteCharAt() is a method of StringBuilder, so you need to call it on your StringBuilder object:

Why index-- ?
Suppose we just deleted the 'a' at index 1.
- Current index: 1
- The next 'a' shifts into index 1.
- The loop increments the index to 2.
- The character at index 1 is skipped!
That means consecutive occurrences of the target character can be missed.

*/
