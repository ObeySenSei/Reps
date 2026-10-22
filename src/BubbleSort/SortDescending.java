import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
        
        int[] arr = {3, 9, 1, 7, 4};
        SortDescending(arr);                   // We only write variable name in the argument section
    }
    static void SortDescending (int[] arr){

        for (int i=0; i<arr.length; i++){
            for (int j = 1; j < arr.length - i ; j++){

                if (arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("The sorted array is Descending Order: " + Arrays.toString(arr));
    }
}
