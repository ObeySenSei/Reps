package Recursion;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(findSubsequence(arr));
    }
    static List<List<Integer>> findSubsequence (int[] arr) {

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());         // start with an empty subset initially

        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            } else {
                start = 0;
            }
            end = outer.size() - 1;
            int n = outer.size();


            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
