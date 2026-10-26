package Recursion.Critical;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String str = "abc";
        List<String> result = permute(str);
        System.out.println("String Permutations: ");
        for (String p : result) {
            System.out.println(p);
        }
    }
    static List<String> permute (String str){
        List<String> result = new ArrayList<>();
        backtrack(str.toCharArray(),0,result);
        return result;
    }
    static void backtrack (char[]arr, int pos, List<String> result){
        if (pos == arr.length){
            result.add(new String(arr));
            return;
        }
        for (int i = pos; i < arr.length; i++){
            swap (arr,pos,i);
            backtrack(arr,pos+1,result);
            swap (arr,pos,i);
        }
    }
    static void swap(char[] arr, int pos, int i){
        char temp = arr[pos];
        arr[pos] = arr[i];
        arr[i] = temp;
    }
}
