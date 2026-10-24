package Recursion;

public class SumOfN {
    public static void main(String [] args){
        sum(5);
        System.out.println(sum(5));
    }
    static int sum (int n){

        if (n==1){
            return 1;
        } else if (n<=0) {
            return 0;
        }

        return n + sum(n-1);
    }
}
