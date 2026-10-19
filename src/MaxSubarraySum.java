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
