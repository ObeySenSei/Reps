package Recursion.Critical;
import java.util.ArrayList;
import java.util.List;

public class PermutationsNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> permutations = permute(arr);

        System.out.println("All permutations:");
        for (List<Integer> p : permutations) {
            System.out.println(p);
        }
    }
    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack( arr,0, result);
        return result;
    }

    private static void backtrack(int[] arr, int start, List<List<Integer>> result) {

        if (start == arr.length) {                            /// Base case: if we reach the end of the array, add a copy of the permutation
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : arr) {
                currentPermutation.add(num);
            }
            result.add(currentPermutation);
            return;
        }

        for (int index = start; index < arr.length; index++) {
            swap(arr, start, index);                     /// 1. Choose: Swap current index with the start index
            backtrack( arr, start + 1,result);              /// 2. Explore: Recurse for the next position
            swap(arr, start, index);                    /// 3. Un-choose (Backtrack): Swap back to restore the original array state
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}