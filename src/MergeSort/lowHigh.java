package MergeSort;
import java.util.Arrays;

public class lowHigh {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1};

        System.out.println("Before sorting: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1); // Sorts the array in-place
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int low, int high) {

        if (low >= high) {         // Fixed: Should return early if low >= high (base case)
            return;
        }
        int mid = low + (high - low) / 2;  // Prevents integer overflow

        // Fixed: Use 'mid' instead of 'mid - 1' for the left half
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        // Optimized: Temp array only needs to be the size of the current subarray
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy leftover cards from left half
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy leftover cards from right half
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        copyBack(temp, arr, low, high);
    }

    static void copyBack(int[] temp, int[] arr, int low, int high) {

        for (int i = low, k = 0; i <= high; i++, k++) {
            arr[i] = temp[k];
        }
    }
}