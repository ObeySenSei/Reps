public class NumPalindrome {
    public static void main(String[] args) {
        int num = 543345;
        boolean ans = isPalindrome(num);
        if (ans){
            System.out.println(ans);
        } else {
            System.out.println(ans);
        }

    }
    static boolean isPalindrome(int n){

        int temp = n;                // to preserve the original number.
        int digit = 0;

        while (n > 0){
            int remainder = n % 10;
            digit = digit * 10 + remainder;
            n = n / 10;                                // Here n already becomes 0 !
        }

        if (digit == temp){
            return true;          // or return digit == temp;
        } else {
            return false;
        }
    }
}


