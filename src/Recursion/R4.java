package Recursion;

public class R4 {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n);
        fun(n - 1);

        System.out.print(n); // VVIP
    }
}

/*

Why doesn't fun(0) print 0? Because the base condition executes first:
if (n == 0) {
    return;
}

 */