package Recursion.Critical;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String str = "abc";
        List<String> result = permutations(str);
        for ( String p : result){
            System.out.println(p);
        }
    }
    static List<String> permutations (String str){
        List<String> result = new ArrayList<>();
        recursion(str.toCharArray(), 0 ,result );
        return result;
    }
    static void recursion(char[]arr, int pos, List<String> result){
        if (pos == arr.length){
            result.add(new String(arr));
            return;
        }
        for (int index = pos; index<arr.length; index++){
            swap (arr,0,index);
            recursion(arr,pos+1, result);
            swap (arr,0,index);
        }
    }
    static void swap(char[]arr, int pos, int i){
        char temp = arr[pos];
        arr[pos] = arr[i];
        arr[i] = temp;
    }
}


