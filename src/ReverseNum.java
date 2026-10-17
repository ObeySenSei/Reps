public class ReverseNum {
    public static void main(String[] args) {

        int num = 123045;
        int reverse = reverseNum(num);
        System.out.println("Number in reverse: " + reverse);
    }
    static int reverseNum (int num){

        int digit = 0;

        while (num>0) {

            int remainder = num % 10;                 // 0 * 10 + 5 = 5
            digit = digit * 10 + remainder;           // 5 * 10 + 4 = 54
            num = num / 10;
        }
        return digit;
    }
}
