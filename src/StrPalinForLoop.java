public class StrPalinForLoop {
    public static void main(String[] args) {
        String num = "Malayalam";

        boolean ans = isPalindrome(num);
        if (ans){
            System.out.println(ans);
        } else {
            System.out.println(ans);
        }
    }
    static boolean isPalindrome (String str){
        if (str == null){
            return false;
        }
        str = str.toLowerCase();

        for (int start = 0, end = str.length()-1; start < end; start++, end--) {  // Notice the commas and the Semi-Colons

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
        }
        return true;
    }
}
