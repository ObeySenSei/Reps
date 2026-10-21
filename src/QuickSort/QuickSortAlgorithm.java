package QuickSort;
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
            int pi = partition(arr, start, end);

            quickSort(arr, start, pi - 1);       // quickSort(arr, 0, -1).....start < end (0 < -1) is False   (0 - 1 = -1)
            quickSort(arr, pi + 1, end);        // quickSort(arr, 1, 3)....start < end (1 < 3) is True. It runs partition on the sub-array [2, 7, 4].
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
Phase 1: The Main Method Startsint[] arr = {4, 2, 7, 1};We start with our unsorted array.quickSort(arr, 0, 3);
We call the sort function for the whole array, where start = 0 and end = 3.Phase 2:
First QuickSort Call (start = 0, end = 3)Since 0 < 3, it runs the partition function for [4, 2, 7, 1].
Inside partition(arr, 0, 3):pivot = arr[3] = 1 (the last element).i = start - 1 = 0 - 1 = -1.
The Loop (j goes from 0 to 2):j = 0 (arr[0] = 4): Is 4 <= 1? No ❌ (i stays -1)j = 1 (arr[1] = 2):
Is 2 <= 1? No ❌ (i stays -1)j = 2 (arr[2] = 7): Is 7 <= 1? No ❌ (i stays -1)
The Pivot Swap:Move i up by 1 (i + 1 = 0).Swap the pivot (1) with the element at index 0 (4).
Array is now: [1, 2, 7, 4]Returns: pi = 0. (Pivot 1 is now locked permanently at index 0!).
Phase 3: The Next Recursive CallsAfter the first partition, quickSort splits into two:
Left Side: quickSort(arr, 0, -1) $\rightarrow$ start < end (0 < -1) is False.
Does nothing (no numbers to the left of 1).Right Side: quickSort(arr, 1, 3) $\rightarrow$ start < end (1 < 3) is True.
It runs partition on the sub-array [2, 7, 4].Phase 4: Second QuickSort Call (start = 1, end = 3)
Inside partition(arr, 1, 3):pivot = arr[3] = 4 (the last element of this sub-array).i = start - 1 = 1 - 1 = 0.
The Loop (j goes from 1 to 2):j = 1 (arr[1] = 2): Is 2 <= 4? Yes! ✔️i increases from 0 to 1.
Swaps arr[1] with itself (stays 2).j = 2 (arr[2] = 7): Is 7 <= 4? No ❌ (i stays 1).
The Pivot Swap:Move i up by 1 (i + 1 = 2).Swap the pivot (4) with the element at index 2 (7).
Array is now: [1, 2, 4, 7]Returns: pi = 2. (Pivot 4 is now locked permanently at index 2!).
Phase 5: Final Cleanup & CompletionQuickSort triggers two final sub-calls for the numbers around
4:Left of 4 ([2]) $\rightarrow$ 1 element, already sorted.Right of 4 ([7]) $\rightarrow$ 1 element, already sorted.
The recursion finishes entirely.🎉 Final Output in main:After Sorting: [1, 2, 4, 7]
 */