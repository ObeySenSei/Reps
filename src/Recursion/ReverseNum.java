package Recursion;

public class ReverseNum {
    public static void main(String[] args) {

        System.out.println("The number in reverse: " + reverseNum(1234, 0));
    }

static int reverseNum (int n, int sum){

        if (n==0){
            return sum;
        }
        int remainder = n % 10;
        sum = sum * 10 + remainder;
        
        return reverseNum(n/10,sum);
    }
}
/*

Each call extracts the last digit and appends it to sum.
Call	  n	     sum before	     remainder	 sum after
1	    1234	       0	         4	         4
2	     123	       4	         3	        43
3	      12	      43	         2	       432
4	       1	     432	         1	      4321
5	       0	    4321	         —	   Returns 4321

Why is this better?
 No static variable: every call has its own accumulated value.
 Reusable: reverseNum(1234, 0) and reverseNum(567, 0) can be called independently without resetting shared state.

One detail: this is a cleaner recursive implementation, not necessarily faster than an iterative loop.
Also, because the result is an int, reversing very large numbers can overflow.
 */
