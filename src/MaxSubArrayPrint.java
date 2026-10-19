import java.util.Arrays;

public class MaxSubArrayPrint {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = findMax(arr);
        System.out.println("Max subarray sum is: " + result);
    }
    static int findMax(int[] arr){

        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        int maxSum = arr[0];        // Initialize maxSum with the first element
        int bestStart = 0;          // Tracks the starting index of the best subarray
        int bestEnd = 0;            // Tracks the ending index of the best subarray

        for(int i = 0; i < arr.length; i++){
            int currentSum = 0;

            for (int j = i; j < arr.length; j++) {          // Inner loop for the ending index
                currentSum = currentSum + arr[j];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    bestStart = i;  // Save the new start index
                    bestEnd = j;    // Save the new end index
                }
            }
        }

        int[] subArray = Arrays.copyOfRange(arr, bestStart, bestEnd + 1);      // Clean and simple print using Java built-ins
        System.out.println("The best subarray is: " + Arrays.toString(subArray));

        return maxSum;
    }
}

/*
In Java, methods like Arrays.copyOfRange(arr, from, to) work with a non-inclusive (exclusive) upper bound.
Here is how the two parameters work:
from (inclusive): It starts copying from this index and includes it.
to (exclusive): It stops copying right before this index and does not include it.

Why we need bestEnd + 1:
If the actual last element of your best subarray is at index bestEnd, and you passed
bestEnd as the second argument, Java would stop right before it and leave out the last element.

By passing bestEnd + 1, you tell Java: "Copy everything up to and including index bestEnd."
 */
