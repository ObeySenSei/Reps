package Recursion.Critical;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = permute(arr);

        System.out.println("All combinations: ");
        for (List<Integer> p : result){
            System.out.println(p);
        }
    }
    static List<List<Integer>> permute(int[] arr){

        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr,0,result);
        return result;
    }
    private static void backtrack (int[] arr , int start, List<List<Integer>>result){
        if (start == arr.length){
            List<Integer> currentP = new ArrayList<>();

            for (int num : arr){
                currentP.add(num);
            }
            result.add(currentP);
            return;
        }
        for (int index = start; index<arr.length; index++){
            swap(arr,start,index);
            backtrack(arr,start + 1,result);        // recursion & backtracking
            swap(arr,start,index);
        }

    }
    private static void swap (int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
