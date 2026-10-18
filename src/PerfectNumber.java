public class PerfectNumber {
    public static void main(String[] args) {
        int n = 28;
        boolean perfect = checkPerfect(n);
        if (perfect){
            System.out.println(perfect);
        } else {
            System.out.println(perfect);
        }
    }
    static boolean checkPerfect(int n){
        int temp = n;                        // You never change n, so you can compare sum directly with n.
        int sum = 0;

        // first find factors
        for (int i=1; i<n; i++){
            if (n % i == 0){
                sum = sum + i;
            }
        }
        return sum==temp;         // returning sum == n is a concise way to return either true or false based on the comparison.
    }
}
