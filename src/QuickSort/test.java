package QuickSort;

public class test {
    public static void main(String[] args) {
        int[]arr ={4,2,7,1};
        System.out.println("Before Sorting: ");
        print(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println("After Sorting: ");
        print(arr);
    }

    static void quickSort(int[]arr,int start, int end){

        if (start < end){
            int pi = partition(arr,start,end);   // Here we are getting an index value of the pivot

            //recursion
            quickSort(arr,start,pi-1);
            quickSort(arr,pi+1,end);
        }
    }
    static int partition(int[]arr,int start, int end){
        int pivot = arr[end];   // lets assume the element in the last index is pivot

        int i = (start - 1);
        for (int j=start ; j < end; j++){
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
        return i + 1;
    }
    static void print(int[] arr){
        for (int num:arr){
            System.out.println(num + " ");
        }
    }
}
