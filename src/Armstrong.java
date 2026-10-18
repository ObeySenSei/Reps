public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        boolean ans = isArmstrong(n);
        if (ans) {
            System.out.println(ans);
        } else {
            System.out.println(ans);
        }
    }
    static int countDigit (int n){
        int count = 0;

        while (n>0){
            int digit = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }
    static boolean isArmstrong(int n){

        int temp = n;                  // Store the Original Number
        int digits = countDigit(n);   //  Call the number of digits
        int sum = 0;

        while (n > 0){                      // say 153
            int remainder = n % 10;
            sum = sum + (int) Math.pow(remainder,digits);    // int ensures we get an integer and Math.pow means 3 tothePower 3
            n = n / 10;
        }

        return temp == sum;
    }
}
