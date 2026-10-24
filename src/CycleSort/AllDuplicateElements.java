package CycleSort;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/?q=all+missing+numbers

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findNumbers(arr));
    }

    static List<Integer> findNumbers (int[] arr){   /// The goal of this phase is to place every number x at its correct index, which is x - 1.

        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){           /// if arr[0] = 4 is not equal to arr[4-1] i.e arr[3] = 7, Swap
                swap (arr, i , correctIndex);
            } else {
                i++;
            }
        }
        /// Declare the array List
        List <Integer> ans = new ArrayList<>();
        for (int index=0; index<arr.length; index++){
            if (arr[index] != index + 1){
                ans.add(arr[index]);                  /// append the values to the array list
            }
        }
        Collections.sort(ans);
        return ans;             /// return the array list
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
