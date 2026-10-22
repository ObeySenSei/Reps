package SelectionSort;

import java.util.Arrays;

public class TracePass {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        tracePass(arr);
    }

    static void tracePass (int[] arr){

        for (int i=0; i <arr.length - 1; i++){
            int minIndex = i;                    // say arr[0]

            for (int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex != i){                                  // Only swap if the minimum element isn't already where it belongs.
            int temp = arr[i];          // store 29
            arr[i] = arr[minIndex];     // 29  becomes 10
            arr[minIndex] = temp;       // 10 becomes 29
            
            System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }
}
    

