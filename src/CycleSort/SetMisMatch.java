package CycleSort;
//https://leetcode.com/problems/set-mismatch/description/

import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 4};
        int[] result = findIndexNDuplicate(arr);
        System.out.println(Arrays.toString(result));

    }
    static int[] findIndexNDuplicate (int[] arr){

        int i = 0;
        while (i< arr.length){
            int correctI = arr[i] - 1;     // Value - 1
            if (arr[i] != arr[correctI]){                  /// 1==1 so skip
                swap (arr, i , correctI);
            } else {
                i++;
            }
        }
        for (int index=0; index<arr.length; index++){    ///   arr[index] is the duplicate value
            if (arr[index] != index + 1){               ///    index + 1 is the missing value
                return new int[] {arr[index], index + 1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap (int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/**
 *
 Iteration 2 (i = 1):
 We look at nums[1], which is 2.
 Its correct index is correct = 2 - 1 = 1.
 We check: nums[1] != nums[1] (2 != 2), which is False.
 Hits the else block and increments i. Now i = 2.
 Array state: [1, 2, 2, 4]

 Phase 2: Finding the Mismatch (for loop)
 Now we scan the sorted array to find where a number doesn't match its expected index position (index + 1).
 Index 0: nums[0] = 1 matches expected value 0 + 1 = 1 ✅
 Index 1: nums[1] = 2 matches expected value 1 + 1 = 2 ✅
 Index 2: nums[2] = 2 does not match expected value 2 + 1 = 3 ❌

 */