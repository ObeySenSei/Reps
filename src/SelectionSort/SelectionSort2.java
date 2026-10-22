package SelectionSort;

import java.util.Arrays;
public class SelectionSort2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int lastIndex = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);

            // Swap maximum element with the last unsorted element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        }
    }
    static int getMaxIndex(int[] arr, int start, int end) {

        int maxIndex = start;

        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}

    
