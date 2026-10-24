package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        selection(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c <= r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r];
            arr[r] = temp;

            selection(arr, r - 1, 0, 0);
        }
    }
}

/*
For {5, 4, 3, 2, 1}, the first pass scans the entire array, remembers that 1 is at index 4, and swaps it with 5 at index 0.
The array becomes [1, 4, 3, 2, 5]. The next pass starts at index 1 and finds the minimum in the remaining unsorted portion.
The key difference from Bubble Sort: Selection Sort uses minIndex to remember where the minimum is, instead of repeatedly swapping
adjacent elements.

 */