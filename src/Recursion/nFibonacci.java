package Recursion;

public class nFibonacci {
    public static void main(String[] args) {

        System.out.println(findFibo(4));
    }

    static int findFibo(int n) {

        if (n < 2) {                // since 0 and 1 are already fibonaci numbers
            return n;
        }

        return findFibo(n - 1) + findFibo(n - 2);      // 6th Fibo number is actually 8. So (6-1) + (6-2)  = 9
    }
}

/*

The Fibonacci sequence starts with:  0, 1, 1, 2, 3, 5, 8, 13,...
Each number is the sum of the two preceding numbers. F(n) = F(n-1) + F(n-2)
For findFibo(6), the calculation eventually becomes: F(6) = F(5) + F(4) = 5+3 = 8


The calls don't all finish simultaneously. Java evaluates the left recursive call first, completes it,
then evaluates the right recursive call, and finally adds their returned values.

if (n < 2) {
    return n;

if (n == 0)  return 0;
if (n == 1)  return 1;

 */



