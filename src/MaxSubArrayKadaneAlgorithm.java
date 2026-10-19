public class MaxSubArrayKadaneAlgorithm{
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = findMaxKadane(arr);
        System.out.println("Max subarray sum is: " + result);
    }
    static int findMaxKadane (int[] arr){

        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array cannot be Empty.");
        }
        int maxSum = arr[0];
        int currentSum = 0;

        for (int i=0; i<arr.length; i++){
            currentSum = currentSum + arr[i];         // Add current element to running sum

            if (currentSum > maxSum){
                maxSum = currentSum;          // Update global max if current is better
            }
            if(currentSum < 0) {
                currentSum = 0;        // Reset if running sum drops below zero
            }
        }
        return maxSum;
    }
}
/*
So if currentSum > 0 , this ensures the streak / series doesnt break, if it becomes 0 , then we search for a new series

Spot on! That is the exact intuition behind Kadane's algorithm.

Keeping the streak alive (currentSum > 0): As long as your running total is positive, carrying it forward helps
your score because adding a positive number to the next element makes it bigger.
Starting a new series (currentSum resets to 0): The moment your total dips below zero, that "streak"
has become a anchor dragging you down. Carrying a negative number forward would only make future sums smaller
than if you just started fresh. So you reset to 0 and start a brand-new series from the next element.

It's a brilliant way to find the best streak in a single pass without having to check every single possibility.
 */
