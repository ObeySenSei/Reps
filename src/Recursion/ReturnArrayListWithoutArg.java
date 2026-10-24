package Recursion;

import java.util.ArrayList;

public class ReturnArrayListWithoutArg {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 4, 3,4};
        System.out.print(findAllIndex(arr, 4, 0));

    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        // This will contain the ans for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> AnsFromBelowCalls = findAllIndex(arr, target, index + 1);
        list.addAll(AnsFromBelowCalls);

        return list;
    }
}
