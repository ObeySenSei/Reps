import java.util.Scanner;

public class PowerExponent {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = in.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = in.nextInt();

        System.out.println("Result: " + findPower(base,exponent));

    }
    static int findPower1(int a, int  b){

        int power = (int) Math.pow(a,b);
        return power;
    }

    static int findPower(int base, int  exponent){

        int product = 1;

        for (int i=1; i <= exponent; i++){
            product =  product * base;                   // 1 * 2 =  2;    2 * 2 = 4;     4 * 2 = 8
        }
        return product;
    }
}

