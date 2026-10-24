package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort (arr, arr.length -1 , 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[]arr, int lastIndex, int col){

        if (lastIndex == 0){
            return ;
        }
        if (col < lastIndex){
            if (arr[col] > arr[col +1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubbleSort(arr,lastIndex,col + 1);

        } else {
            bubbleSort (arr, lastIndex - 1, 0);
        }
    }
}
