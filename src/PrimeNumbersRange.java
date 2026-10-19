import java.util.Scanner;

public class PrimeNumbersRange {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter range: ");
        int range = in.nextInt();
        System.out.println("Prime numbers between 1 and " + range + " are: ");
        findPrimes(range);

    }
    static void findPrimes(int range) {
        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int range){

        if (range < 2){
            return false;
        }
        for (int i=2; i * i <= range; i++){        // say the range is 40 ->  i checks till 6 * 6, i.e, 36
            if ( range % i == 0){                  // So, i basically stops at 6 -> 1,2,3,4,5,6.   37 % 6 = 1.
                return false;                      // Loop stops at 7 * 7 = 49 > 40. Condition becomes false and the loop is then terminated
            }
        }
        return true;
    }
}
