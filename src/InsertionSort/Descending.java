package InsertionSort;

import java.util.Arrays;
public class Descending {
    public static void main(String[] args) {
        
        int[] arr = {7, 3, 9, 2, 5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort (int[] arr){

        for (int i=1; i<arr.length; i++){
            int current = arr[i];                
            int j = i-1;                        

            while (j>=0 && current > arr[j]){        // Just one simple  " < " change            is 7 less than 3 ? FALSE

                arr[j+1] = arr[j];                  // 7 becomes 9 at index 1. (0+1)
                j--;                                                     
            }
            arr[j+1] = current;           
        } 
    }
}

    
