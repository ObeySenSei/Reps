import java.util.Scanner;

public class ArmstrongRangeInput {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter start range: ");
        int start = in.nextInt();
        System.out.println("Enter end range: ");
        int end = in.nextInt();

        System.out.print("The Armstrong numbers from " + start + " to " + end + " are: ");

        findArmstrong (start, end);
        in.close();


    }
    static void findArmstrong (int start, int end) {

        for (int i = start; i <= end; i++) {   // Loop from which number to start and end.

            int num = i;
            int sum = 0;
            int digits = countDigits(i);     // counts the digit in 153

            while (num > 0) {
                int remainder = num % 10;
                sum = sum + (int) Math.pow (remainder,digits);
                num = num / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
    static int countDigits(int n) {

        int count = 0;

        if (n == 0) {         // Test case to count the digit 0 as 1 time.
            return 1;
        }
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}

