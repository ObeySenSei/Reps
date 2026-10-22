package InsertionSort;

import java.util.Arrays;
public class SortNRemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {-2, 5, -2, 0, 3, 1, 0};
        insertionSort(arr);
       
        int[] ans = removeDuplicates(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Array without duplicates: " + Arrays.toString(ans));
    }

    static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    static int[] removeDuplicates(int[] arr) {

        int size = 0;                                                  // STEP 1: Count the unique elements.

        for (int i = 0; i < arr.length; i++) {                         // say the sorted array is [ 1, 2, 2, 3, 4, 4, 5, 6 ]

            if (i == 0 || arr[i] != arr[i - 1]) {                      // Option 1: Compare with the previous element           Since the left side is already true, Java doesn't even check the right side!
                size++;
            }
        }

        int[] newArr = new int[size];                                  // STEP 2: Create a new array of the exact required size.
        
        int index = 0;                                                 // STEP 3: Copy only unique elements into the new array.

        for (int i = 0; i < arr.length; i++) {

            if (i == 0 || arr[i] != arr[i - 1]) {
                newArr[index] = arr[i];
                index++;
            }
        }

        // STEP 4: Return the new array.
        return newArr;
    }
}
