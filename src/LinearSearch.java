public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {6, 2, 8, 4};
        int ans = findIndex(arr,8);
        System.out.println(ans);
    }
    static int findIndex(int[]arr, int target){

        for (int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
/*

Write linearSearch(int[] arr, int target).
Example: {6, 2, 8, 4}, target 8 → 2
Return -1 if the target is absent.
Hint: Visit each index from left to right.

 */
