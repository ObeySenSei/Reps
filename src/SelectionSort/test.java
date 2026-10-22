package SelectionSort;

public class test {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 1};
        selectionSort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    static void selectionSort(int[] arr){

        for (int i=0;i<arr.length-1; i++){

            int minIndex = i;         // say arr[0] that is 2 is the smallest index

            for (int j = i+1; j<arr.length; j++){
                if (arr[minIndex] > arr[j] ){           // is 2 greater than 1, YES.
                    minIndex = j;                       // then minIndex = arr[3]
                }
            }
            int temp = arr[i];                    // temp = 2      store the index containing value 2 that is arr[0]
            arr[i] = arr[minIndex];               // 2 = arr[3]    2 goes to arr[3]
            arr[minIndex] = temp;                 // 1 = arr[0]    1 is copied to arr[0]
        }
    }
}
