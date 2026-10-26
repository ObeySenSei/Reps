package Recursion.Critical;

import java.util.ArrayList;
import java.util.List;

public class PermutationsString {
    public static void main(String[] args) {
        String str = "abc";
        List<String> result = permute(str);

        System.out.println("String Permutations:");
        for (String p : result) {
            System.out.println(p);
        }
    }

    public static List<String> permute(String str) {
        List<String> result = new ArrayList<>();
        backtrack(str.toCharArray(), 0, result);
        return result;
    }

    private static void backtrack(char[] arr, int fixed, List<String> result) {
        if (fixed == arr.length) {
            result.add(new String(arr));
            return;
        }

        for (int i = fixed; i < arr.length; i++) {
            swap(arr, fixed, i);
            backtrack(arr, fixed + 1, result);
            swap(arr, fixed, i); // Backtrack
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}