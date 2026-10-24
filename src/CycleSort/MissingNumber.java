package CycleSort;
import java.util.Arrays;
/// [...](https://leetcode.com/problems/missing-number/description/)
/// Sort the array and return the missing number, instead of making that number appear on the array

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 5, 2};          /// Skip N in the array. N = 5 here, so we need to skip 5.

        System.out.println(findElement(arr));
    }
    static int findElement (int[]arr ){

        int i = 0;
        while (i < arr.length){
            int correct = arr[i];            ///  So, correct =  3, i.e  arr[0]    Is the element at arr[0] == arr[3] ?? iS 3 == 5 No. So EXECUTE
            if (arr[i] < arr.length && arr[i] != arr[correct]){          /// is 5 < 5 ? No. Loop is not executed.  arr[i] != arr[arr[i]] not equal to its own index, then
               swap (arr,i,correct);
            } else {
                i++;                                    // Moves to the next index if we can't/don't need to swap
            }
        }

        /// Search for the missing element.....By this time the array would have been already sorted !
        for (int index=0; index < arr.length; index++){
            if (arr[index] != index){                        // [1,2,3,0,5] = so here index 4 != 4 that is 0; so we return 4.
                return index;
            }
        }
        return arr.length;                  ///  If 0 to n-1 are all in place, then n is missing.

    }
    static void swap (int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}

