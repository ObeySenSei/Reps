package SelectionSort;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        
        int[] arr = {29, 10, 14, 37, 13};
        sortArray(arr);
    }
    static void sortArray (int[] arr){

        for (int i=0; i <arr.length - 1; i++){
            int minIndex = i;                    // say arr[0]

            for (int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];     // store 29
            arr[i] = arr[minIndex];     // 29  becomes 10
            arr[minIndex] = temp;       // 10 becomes 29
        }
        System.out.println(Arrays.toString(arr));
    }
}


// same shit
