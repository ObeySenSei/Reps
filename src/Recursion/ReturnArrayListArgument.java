package Recursion;
import java.util.ArrayList;

public class ReturnArrayListArgument {
    static ArrayList<Integer>list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 4, 3,4};
        findAllIndex(arr, 4, 0,list);

        ArrayList<Integer> ans = findAllIndex(arr,4,0,new ArrayList<>());   //  Notice !! new ArrayList<>()
        System.out.println("The indices of the target elements: " + ans);

    }

    static ArrayList<Integer> findAllIndex (int[] arr, int target, int index, ArrayList<Integer>list){

        if (index == arr.length){
            return list;              // Base case
        }
        if (arr[index] == target){
            list.add(index);          // If a target is found, add those indices to the list
        }
        return findAllIndex(arr,target,index+1, list);   // update the index !!
    }
}
