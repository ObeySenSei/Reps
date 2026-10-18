public class CountOccurence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 7, 2};
        int ans = findOccurence(arr,2);
        System.out.println(ans);
    }
    static int findOccurence(int[] arr, int target){

        int count = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
}
