package Recursion;

public class ReverseHelperFunction {

        public static void main(String[] args) {
            System.out.println(reverse(1234));
        }

        static int reverse(int n) {  // Job is to count the digits and pass that information to the recursive method.

            if (n == 0) {
                return 0;
            }
            int digits = (int) Math.log10(n) + 1;     // (3 + 1) = 4 i.e the total no of digits
            return helper(n, digits);                // It passes 1234 and 4 to the next method.
        }

        private static int helper(int n, int digits) {
            if (n % 10 == n) {
                return n;
            }

            int rem = n % 10;
            return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
            // the first call is effectively calculating: 4 x 1000 = 4000  +  helper(123,3)
        }
    }

/*
Instead of building the reversed number from left to right,
we uses the number of digits to determine the place value of each digit.

1234 = 4 * 1000 + 3 * 100 + 2 * 10 + 1

Why count the digits? Because the algorithm needs to know which power of 10 to multiply each extracted digit by.

                               private static int helper(int n, int digits)
This method receives two values:
 n: the part of the original number that remains.
 digits: how many digits are in that remaining number.
 */
