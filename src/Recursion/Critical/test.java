package Recursion.Critical;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = permutations(arr);

        for (List<Integer> p : result) {
            System.out.println(p);
        }
    }
    static List<List<Integer>> permutations(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr,0,result);
        return result;
    }
    static void backtrack(int[]arr, int pos, List<List<Integer>>result){
        if (pos==arr.length){
            List<Integer> newCombination = new ArrayList<>();
            for(int nums : arr){
                newCombination.add(nums);
            }
            result.add(newCombination);
            return;
        }
        for (int i = pos; i<arr.length; i++){
            swap(arr,pos,i);
            backtrack(arr,pos+1,result);
            swap(arr,pos,i);
        }

    }
    static void swap(int[]arr, int pos, int i){
        int temp = arr[pos];
        arr[pos] = arr[i];
        arr[i] = temp;
    }
}


