import java.util.Arrays;
public class sortDuplicatesNegatives {
        public static void main(String[] args) {

         int[] arr = {-3, 5, 0, -3, 2, 5, -1};
         bubbleSort(arr);
        
    }
    static void bubbleSort (int[] arr){

        boolean isSorted;

        for (int i=0 ; i < arr.length; i++){
            isSorted = true;                  // Lets assume the array is already sorted

            for (int j=1; j < arr.length - i; j++){       // for each pass the MAX VALUE in that pass will come at the last index.
                
                if (arr[j] < arr[j-1]){
                    int temp  = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    isSorted = false;                   // If the swap happens i.e TRUE, it means the array was not sorted;
                   }
                }
                if (isSorted == true){          // if already sorted (isSorted)
                    break;                      // no need to swap
                }
        }
        System.out.println("The sorted array is: " + Arrays.toString(arr));
    }
}

// Same solution as Optimized Bubble Sort.
    
