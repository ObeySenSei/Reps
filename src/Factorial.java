public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFactorial(n));
    }
    static int findFactorial(int n){
        int factorial = 1;

        for (int i=5; i>=1; i--){
            factorial = factorial * i;
        }
        return factorial;
    }
}
