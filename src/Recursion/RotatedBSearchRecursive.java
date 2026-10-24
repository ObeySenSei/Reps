package Recursion;

public class RotatedBSearchRecursive {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 1, 2, 3, 4};
        System.out.println(findTarget(arr,2,0,arr.length-1));

    }
    static int findTarget (int[]arr,int target,int start,int end) {

        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        // Check if the left half is sorted
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return findTarget(arr, target, start, mid - 1);
            } else {
                return findTarget(arr, target, mid + 1, end);
            }

        } else {
            // The right half must be sorted
            if (target > arr[mid] && target <= arr[end]) {
                return findTarget(arr, target, mid + 1, end);
            } else {
                return findTarget(arr, target, start, mid - 1);
            }
        }
    }
}

/*

The two situations are:
 Situation A: The left half is sorted, but the target isn't inside it. Therefore, search the right half.
 Situation B: The right half is sorted, and the target is inside it. Therefore, search the right half.

 */
