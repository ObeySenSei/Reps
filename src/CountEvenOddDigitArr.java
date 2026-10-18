public class CountEvenOddDigitArr {
    public static void main(String[] args) {

        int[] arr = {4,8,2,7,1};

        System.out.println("No of even digits: " + checkEven (arr));
        System.out.println("No of odd digits: " + checkOdd (arr));

    }
    static int checkEven (int[] arr){

        int count = 0;

        for (int i=0; i< arr.length; i++){
            if (arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
    static int checkOdd (int[] arr){

        int count = 0;

        for (int i=0; i< arr.length; i++){
            if (arr[i] % 2 == 1){
                count++;
            }
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
