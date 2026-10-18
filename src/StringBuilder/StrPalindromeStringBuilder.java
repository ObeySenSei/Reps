package StringBuilder;

public class StrPalindromeStringBuilder {
    public static void main(String[] args) {
        String num = "Malayalam";

        boolean ans = isPalindrome(num);
        if (ans){
            System.out.println(ans);
        } else {
            System.out.println(ans);
        }
    }
    static boolean isPalindrome (String str) {
        if (str == null) {
            return false;
        }
        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder(str);      // Initialize StringBuilder named sb.

        String reversed = sb.reverse().toString();      // Reverse the string using String Builder function

        if (str.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }
}
/*
 We can also use    return str.equals(reversed)

 str == reversed checks whether both references point to the same object.
 str.equals(reversed) checks whether both strings contain the same characters.

 */
