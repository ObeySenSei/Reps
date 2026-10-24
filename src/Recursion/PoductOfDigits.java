package Recursion;

public class PoductOfDigits {
    public static void main(String[] args) {

        System.out.println(findProduct(3214));
    }

    static int findProduct(int n) {

        if (n % 10 == n) {    // If it's a single digit, We are returning the number itself.  3 % 10 = 3.
            return n;
        }
        return (n % 10) * findProduct(n / 10);
    }
}
