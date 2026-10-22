package InsertionSort;

public class  CountShift {
    public static void main(String[] args) {
        
        int[] arr = {4, 3, 2, 1};

        int ans = insertionSort(arr);
        System.out.println("Number of times an element was shifted to the right: " + ans);
    }
    static int insertionSort (int[] arr){

        int count = 0;

        for (int i=1; i<arr.length; i++){
            int current = arr[i];                
            int j = i-1;                        

            while (j>=0 && current < arr[j]){        

                arr[j+1] = arr[j];                 
                count++;                 // Move the count inside the while loop.   Count each shift  if it happens.
                j--;                                                     
            }
            arr[j+1] = current;      
        } 
        return count;
    }
}
