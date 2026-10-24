package Recursion;

public class StepsToReduceZero {
    public static void main(String[] args) {
        findsteps(14);
        System.out.println("The no. of steps taken to reduce 14 to 0 is: " + findsteps(14));

    }
    static int findsteps (int n) {
       return helper(n, 0);    // Let 0 be the initial no. of steps
    }

    private static int helper(int n, int steps) {

        if (n==0){
            return steps;
        }
        if (n % 2 == 0){            // If n is a Positive Number,
            return helper (n/2 , steps + 1);       // Do this
        }
        return helper(n-1, steps + 1);             // Else do this
    }
}
