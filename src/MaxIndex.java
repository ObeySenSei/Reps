public class MaxIndex {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 15, 6};
        System.out.println(findIndex(arr));
        System.out.println(findMax(arr));

    }
    static int findIndex(int[] arr) {
        int maxIndex = 0;                                // Notice how we use 0 to return index...not arr[0] !!
        for (int i=1; i<arr.length; i++){
            if (arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
