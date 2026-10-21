package QuickSort;

public class QuickSortAlgorithm {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1};

        System.out.print("Before sorting: ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.print("After sorting:  ");
        printArray(arr);
    }

    static void quickSort(int[] arr, int low, int high) {     // 2. The recursive Quick Sort function
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {    // 3. The partition function (handles the in-place rearranging)
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];                  // Place the pivot into its final correct spot
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void printArray(int[] arr) {        // Helper method to print the array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}