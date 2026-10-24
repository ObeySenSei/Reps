package Recursion;
import java.util.ArrayList;
public class ReturnArrayListVoid {

    static ArrayList<Integer>list = new ArrayList<>();   // Declare the Array List

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 3};
        findAllIndex(arr, 3, arr.length-1);
        System.out.print(list);

    }

    static void findAllIndex(int[]arr, int target, int index){

        if (index < 0){
            return ;                       // not return -1;
        }

        if (arr[index] == target){
            list.add (index);             // instead of return index; Also notice the change of brackets
        }
        findAllIndex(arr,target,index - 1);  // Don't use the "return" statement if the method is if type  "Void"
    }
}

/* Find all the indices of a target and store them in an ArrayList, instead of returning just one index.
   int[] arr = {1, 3, 3, 4, 3};   The result should be: [1, 2, 4]

   add() is a method, not a variable, so you call it using parentheses without an equals sign.
 */
