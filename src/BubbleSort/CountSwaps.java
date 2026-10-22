public class CountSwaps {
    public static void main(String[] args) {
        
        int[] arr = {4, 3, 2, 1};
        countSwaps(arr);
        
    }
    static void countSwaps (int[] arr){

        int count = 0;

        for (int i=0; i<arr.length-1; i++){               // 
            int swap = 0;

            for (int j=1; j<arr.length-i; j++){

                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                // when this swap happens, just increment swap . This will count the total no of swaps in a single Pass
                    swap++;

                // count = swap;   // update the value of this current swap run.   Not necessary !
                }
            }
           
            count = count + swap;     // Add this pass's swaps to the total
    
        }
        System.out.println("The total no of swaps: " + count);
    }
}

/* 
3. Why only 3 passes?
For an array of 4 elements, Bubble Sort needs at most (n-1 = 3) passes.
After each pass, the largest remaining element reaches its correct position at the end.

*/ 
