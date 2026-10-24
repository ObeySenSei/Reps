package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println("Number of 0's: " + findZeroes(2001004));
    }
    static int findZeroes (int n){
        return helper (n,0);
        }

    private static int helper(int n, int count) {
        if (n==0){
            return count;
    }
        int remainder = n % 10;
        if (remainder==0){                                 // Is the last digit zero?
            return helper(n/10,count + 1);        // If so do this    count++
        }
        return helper(n/10,count);                      // or else do this
    }
}
/*

helper(2001004, 0);

Here, helper() receives two things:
 n — the number we are currently processing.
 count — the number of zeroes we have found so far.

 You're asking: Is the last digit zero?
- If yes: increase count by one, then process the remaining digits.
- If no: keep count unchanged, then process the remaining digits.
 */