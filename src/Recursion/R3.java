package Recursion;

public class R3 {
    public static void main(String[] args) {
        numbers(1);
    }
    static void numbers (int n){

        if (n==6) {
            System.out.print(n);
            return;
        }
            System.out.print(n);
            numbers (n+1);
        }
    }

