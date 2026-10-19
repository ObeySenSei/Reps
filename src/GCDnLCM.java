public class GCDnLCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int gcd = findGCD(a,b);
        int lcm = findLCM(a,b);
        System.out.println(gcd);
        System.out.println(lcm);
    }
    static int findGCD (int a, int b){

        int gcd = 1;            // lets assume the gcd of the two numbers is 1.

        for (int i=1; i<=a && i<=b; i++){       // i less than or equal to 'a' and 'b'
            if (a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    static int findLCM (int a, int b){

        if (a==0 || b==0){
            return 0;
        }

        int lcm = (a / findGCD(a,b)) * b;
        return lcm;
    }
}
