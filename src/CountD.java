import java.util.Scanner;

public class CountD {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int digit = countDigits(n);
        System.out.println("The number of digits in " + n + " is: " + digit);
    }
    static int countDigits (int n){

        if (n==0){        // What to do if the number is 0.
            return 1;
        }
        if (n < 0){       // What to do if the number is a Negative Number.
           n = -n;      // num = -num changes -1234 to 1234. -(-5) = 5
        }

        int count = 0;

        while (n>0){
            int remainder = n % 10;
            count++;
            n = n/10;
        }
        return count;
    }
}
