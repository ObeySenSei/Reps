public class ProductDigits {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(product(n));
    }

    static int product(int n) {
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            product = product * digit;
            n = n / 10;
        }
        return product;
    }
}


