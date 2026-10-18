public class EvenOddDigitCount {
    public static void main(String[] args) {

            int n = 48271;
            System.out.println("No of even digits: " + checkEven (n));
            System.out.println("No of odd digits: " + checkOdd (n));
    }
    static int checkEven (int n){

            int count = 0;

            while (n>0){
                int digit = n % 10;
                if (digit % 2 == 0) {
                    count++;
                }
                n = n / 10;
            }
            return count;
    }
    static int checkOdd (int n){

            int count = 0;

            while (n>0){
                int digit = n % 10;
                if (digit % 2 != 0) {
                    count++;
                }
                n = n / 10;
            }
            return count;
        }
    }
/*
Count Even and Odd Digits
Write countEvenDigits(int n) and countOddDigits(int n).
Example: countEvenDigits(48271) → 2
countOddDigits(48271) → 3
Hint: Extract each digit using % 10 and check its parity.
 */
