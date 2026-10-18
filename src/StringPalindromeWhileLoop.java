public class StringPalindromeWhileLoop {
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
            str = str.toLowerCase();    // Converts the String to LowerCase

            int start = 0;
            int end = str.length() - 1;

            while (start < end){
                if (str.charAt(start) != str.charAt(end)){   // If the charAt at 0 is not equal to charAt....
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
}
