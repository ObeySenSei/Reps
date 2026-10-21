package QuickSort;
// https://youtu.be/Vtckgz38QHs
import java.util.Arrays;
public class QuickSortAlgorithm {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting: " + Arrays.toString(arr));

    }

    static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);      // Why pi - 1 and pi + 1 matter:Because index pi is already permanently sorted, we never want to touch it or include it in future sorting steps again.

            quickSort(arr, start, pi - 1);       // quickSort(arr, 0, -1).....start < end (0 < -1) is False   (0 - 1 = -1)       Left sub-array: Goes from start all the way up to pi - 1 (stopping right before the sorted pivot).
            quickSort(arr, pi + 1, end);        // quickSort(arr, 1, 3)....start < end (1 < 3) is True. It runs partition on the sub-array [2, 7, 4].           Right sub-array: Starts right after the pivot at pi + 1 and goes to end.
        }
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];            // value 4 is copied to temp
        arr[i + 1] = arr[end];           // arr[0] i.e arr[-1+1] becomes 1      The Pivot Swap: Move i up by 1 (i + 1 = 0)
        arr[end] = temp;                // arr[end]  becomes 4

        return i + 1;
    }
}

/*

Remember:
- start < end → at least two elements.
- start == end → exactly one element.
- start > end → zero elements.
An array containing zero or one element is already sorted. There is no need to partition it.

quickSort(arr, 0, 0); Here, start == end, so start < end is false. The function stops without making another recursive call.

Why for (int j = start; j < end; j++)?
Purpose: To examine every element except the pivot.  REMEMBER pivot is placed at end. int pivot = arr[end];

The key difference
start < end    	 quickSort()	Prevents recursion on subarrays of size zero or one.
    j < end	     partition()	Scans elements while excluding the pivot.


 */