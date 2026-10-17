public class Prime2{
    public static void main(String[] args) {
        int num = 12;
        boolean isPrime = checkPrime(num);
        if (isPrime) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    static boolean checkPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
/*

The factor pairs of 44 are:
Factor 1	Factor 2	Product
1           	44	      44
2	            22	      44
4	            11	      44
Notice something? In every pair, one factor is smaller and the other is larger.
For example:
- If 2 divides 44, then 22 also divides 44.
- If 4 divides 44, then 11 also divides 44.
You don't need to check both factors in a pair. Finding the smaller one is enough to prove that the number isn't prime.

We only need to check integer divisors up to 6.
- 2 * 2 <= 44 → true
- 3 * 3 <= 44 → true
- 4 * 4 <= 44 → true
- 5 * 5 <= 44 → true
- 6 * 6 <= 44 → true
- 7 * 7 <= 44 → false
When i = 7, the loop stops. We don't need to check 7, 8, 9, and so on, because any factor larger than \(\sqrt{44}\) would have a corresponding smaller factor that we've already had the opportunity to check.
In this example, we discover 44 % 2 == 0 immediately, so the method returns false much earlier.
 */

