package SelectionSort;

import java.util.Arrays;
public class DescendingOrder {
    public static void main(String[] args) {
        
        int[] arr = {8, 3, 6, 1, 9};
        sortArray(arr);
    }
       static void sortArray (int[] arr){

        for (int i=0; i <arr.length - 1; i++){
            int maxIndex = i;                    // say arr[0]

            for (int j=i+1; j<arr.length; j++){
                if (arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = arr[i];     // store 29
            arr[i] = arr[maxIndex];     // 29  becomes 10
            arr[maxIndex] = temp;       // 10 becomes 29
        }
        System.out.println(Arrays.toString(arr));
    }
}

/*

  static void sortArray(int[] arr) 

        for [ int i = arr.length - 1; i > 0; i-- ]

            int maxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }


*/

    

