package SelectionSort;

import java.util.Arrays;

public class CountSawps {
    public static void main(String[] args) {
        
        int[] arr = {4, 1, 3, 2};
        int ans = countSwaps(arr);

        System.out.println("Total Swaps: " + ans);
    }

    static int countSwaps (int[] arr){

        int count = 0;

        for (int i=0; i <arr.length - 1; i++){
            int minIndex = i;                 // say arr[0]

            for (int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex != i){                                  // Only when minIndex is not equal to index, Perform the swap
            int temp = arr[i];          // store 29
            arr[i] = arr[minIndex];     // 29  becomes 10
            arr[minIndex] = temp;       // 10 becomes 29
            count++;
            }
        }
        
        System.out.println(Arrays.toString(arr));
        return count ;
    }
}
