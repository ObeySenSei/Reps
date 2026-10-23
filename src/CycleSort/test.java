package CycleSort;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        int arr[] = {3, 5, 2, 1, 4};      // For cyclic sort to work it should be in the range on one till N, i.e, the number of elements

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){

        int i=0;       // i is set to the first index

        while (i<arr.length){

            int correctIndex = arr[i] - 1;
            if (arr[i] != correctIndex){
                swap (arr, i, correctIndex);
            } else {
                 i++;
            }
        }
    }
    static void swap (int[] arr, int start, int end){
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end] = temp;
    }
}
