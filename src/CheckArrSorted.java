public class CheckArrSorted {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        boolean result = checkArray(arr);
        if (result) {
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }
    static boolean checkArray (int[]arr){   // Important part: we're checking pairs of elements, not individual elements.

        for (int i=0; i< arr.length-1 ; i++) {        // arr[i+1] makes up for it

            if (arr[i+1] < arr[i]) {               // This particular condition makes sure we check every pair in the array.
                return false;
            }
        }
        return true;                           // Only when we check every pair, do we return true
    }
}
/*
Check Whether an Array Is Sorted
Hint: Compare each element with the element immediately after it.

For the first pair, 1 and 3:
- 3 > 1 is true.
- Your method immediately returns true.
But the remaining elements are 5, 3, which are out of order. So the array is not sorted!
The rule: You must check every adjacent pair. If even one pair is out of order, return false.
Only return true after the loop finishes.

 */
