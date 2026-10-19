// Brute Force Approach
public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = findMax(arr);
        System.out.println("Max subarray sum is: " + result);
    }

    static int findMax(int[] arr){

        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        int maxSum = arr[0];        //  Initialize maxSum with the first element to correctly handle all-negative arrays

        for(int i=0; i<arr.length; i++){
            int currentSum = 0;

            for (int j=i; j<arr.length; j++) {          // Inner loop for the ending index
                currentSum = currentSum + arr[j];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
}

/*

If an array contains only negative numbers (e.g., {-3, -1, -5}), initializing maxSum to 0 would incorrectly
return 0 (which implies an empty subarray). To handle this correctly:Initialize maxSum = arr[0] (the first element).
This ensures that even if all numbers are negative, the algorithm will return the single largest (least negative)
element instead of 0.

To integrate the subarray printing feature directly into your exact code structure, you just need to add tracking variables
(bestStart and bestEnd) inside your findMax method, update them whenever maxSum updates, and print them out before returning.

 */
