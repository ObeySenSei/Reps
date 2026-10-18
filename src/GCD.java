public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(20,8));
    }
    static int gcd (int a, int b){

        while (b!=0){                     // let's say b is 8
            int remainder = a % b;        // 20 % 8  = 4
            a = b;                        // a becomes 8;
            b = remainder;                // b becomes 4.           next a = 8   and b = 4 are compared....
        }
        return a;                         // returns a when b becomes 0 i.e (4,0).
    }
}
