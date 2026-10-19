public class CheckAmicableNumbers {
    public static void main(String[] args) {
        int a = 220;
        int b = 284;
        boolean isAmicable = checkAmicable (a,b);
        System.out.println(isAmicable);
    }
    static boolean checkAmicable (int a, int b){

        int sumA = 0;       // Here 1+2+4+5+10+11+20+22+44+55+110 = 284 will be stored.
        int sumB = 0;       // 1+2+4+71+142 = 220 will be stored.

        for (int i=1; i <= a / 2; i++){
            if (a % i == 0){
                sumA = sumA + i;
            }
        }
        for (int i=1; i <= b / 2; i++){
            if (b % i == 0){
                sumB = sumB + i;
            }
        }
        if (sumA != b || sumB != a){      // If any on of the two condition is False, we return false;
            return false;
        }
        return true;
    }
}
/*

public class CheckAmicableNumbers {

    public static void main(String[] args) {
        int a = 220;
        int b = 284;

        System.out.println(areAmicable(a, b));
    }

    static int sumProperDivisors(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    static boolean areAmicable(int a, int b) {

    int sumA = sumProperDivisors(a);
    int sumB = sumProperDivisors(b);

    if (sumA == b && sumB == a) {
        return true;
    }
    return false;
}


 */
