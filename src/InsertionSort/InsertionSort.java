package InsertionSort;//Swap method (Easy to Understand)

import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};

        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        
    }
    static void insertionSort (int[] arr){

        for (int i=0; i<arr.length-1; i++){  

            for (int j=i+1; j>0; j--){
                if (arr[j] < arr[j-1]){

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                } else {
                    break;         //  arr[j] > arr[j-1]  means that the right part is already sorted, no need to check
                }
            }
        }
    }
}

