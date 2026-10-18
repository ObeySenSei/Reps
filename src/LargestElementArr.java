public class LargestElementArr {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 15, 17};
        int result = findMax (arr);

        System.out.println("largest Element: " + result);
        System.out.println("Smallest Element: " + findMin(arr));
    }

    static int findMax (int[] arr){

        int max = arr[0];                       // max = 4

        for (int i=1; i< arr.length; i++){
            if (arr[i] > max){                  // If 9 > 4, then max = 9.
                max = arr[i];
            }
        }
        return max;
    }

    static int findMin (int[] arr){

        int min = arr[0];                       // We assume the value at index 0 i.e 4 to be the smallest

        for (int j=1; j< arr.length; j++){
            if (arr[j] < min){
                min = arr [j];
            }
        }
        return min;
    }
}
