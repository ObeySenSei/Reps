package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {

        findSum(3142);
        System.out.println(findSum(3142));
    }
    static int findSum (int n){

        if (n == 0) {
            return 0;
        }
        return (n % 10) + findSum (n /10);
    }
}
/*
Substitute n = 1234:

1234 %10 + findSum(1234/10)
    4    + findSum(123)

Why?
- 1234 % 10 = 4 → extracts the last digit.
- 1234 / 10 = 123 → removes the last digit.

The rule of recursion: the recursive argument must move toward the base case.
Here, n / 10 progressively reduces the number until it reaches 0.

The modulo operation extracts the digit you want to add; integer division reduces the problem so recursion can finish.
 */
