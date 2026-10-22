package BubbleSort;

public class Alternative {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4};
        bubbleSort(arr);
        for (int i : arr){
            System.out.print( i + " ");           // To print the resultant array
        }
    }
    static void bubbleSort(int[]arr){
        boolean isSorted = true;

        for(int i=0; i<arr.length; i++){                  // i controls the number of passes
            for (int j=0; j<arr.length - i - 1; j++){     // If we want to start the comparison from index 0;

                if (arr[j] > arr[j+1]){         // sorts in Ascending order, if we want descending just change to arr[j] < arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted==true){
                break;
           }
        }
    }
}
