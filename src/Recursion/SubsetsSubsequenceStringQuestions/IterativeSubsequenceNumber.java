package Recursion.SubsetsSubsequenceStringQuestions;
import java.util.ArrayList;
import java.util.List;

public class IterativeSubsequenceNumber{
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        List<ArrayList<Integer>> result = getSubsequence(arr);
        System.out.println(result);
    }
    static List<ArrayList<Integer>> getSubsequence (int[] arr){

        List<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add (new ArrayList<>());

        for (int i=0; i<arr.length; i++){
            int num = arr[i];

            int currentSize = outer.size();

            for (int j=0; j<currentSize; j++){
                ArrayList<Integer> newCombo = new ArrayList<> (outer.get(j));
                newCombo.add(num);
                outer.add(newCombo);
            }
        }
        return outer;
    }
}

/**
     for (int num : arr){
     int currentSize = outer.size();
 }
 */

