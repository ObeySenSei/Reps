package QuickSort;

public class practice {
    public static void main(String[] args) {
        int arr[] = {2,1,4,3,5,7,9,6,8};
        quickSort (arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void quickSort(int[] arr, int start, int end){

        if (start < end){
            int pivot = partition(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }
    static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for(int j = start; j<end; j++){
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;
    }
}
