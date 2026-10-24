package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int ans = factorial (5);
        System.out.println(ans);
    }
    static int factorial (int n){

        if (n==0 || n==1){                  // 1! = 1 and 0! = 1, both equals to 1.
            return 1;
        }
        return n * factorial(n-1);
    }
}
