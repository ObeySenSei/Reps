package Recursion;

public class PreDecrementPostDecrementRecursion {

    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if (n == 0) {
            System.out.println("Base case reached!");
            return;
        }

        System.out.println("Before recursive call: n = " + n);

        fun(--n);       // fun(n--) will give an error. Why ? Check my Interview Prep PDF
        System.out.println("After recursive call: n = " + n);
    }
}
/*
Java passes primitive arguments such as int by value. Every call to fun(int n) receives its own copy of the argument.
With fun(--n), the current call's copy is decreased and the decreased value is passed to the next call.
With fun(n--), the old value is passed to the next call, even though the current call's copy is decreased.

In real recursive code, the clearest version is usually: fun(n - 1);

It directly expresses the intention: call the method with a value one less than n, without modifying the current call's variable.



 */