package InsertionSort;

import java.util.Arrays;

public class Ascending {
    public static void main(String[] args) {
        
        int[] arr = {5, 2, 4, 6, 1, 3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort (int[] arr){

        for (int i=1; i<arr.length; i++){
            int current = arr[i];                  // lets save 2;
            int j = i-1;                           // here j is 5  at index 0............i-1 i.e    1-1 = 0       J's value is effectively 0 here/

            while (j>=0 && arr[j]> current){        // if 5 is greater than 2

                arr[j+1] = arr[j];            // 5 takes arr[1];
                j--;                                                       // j has already decreased inside the while loop!!     J's value = 0-1  = -1.
            }
            arr[j+1] = current;             // 5 becomes 2.         // We need to update the position to index 0     . So -1 + 1 = 0
        } 
    }
    
}
