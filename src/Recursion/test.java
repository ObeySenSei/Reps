package Recursion;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String str = "abc";
        List<String> result = getSubsequence(str);
        System.out.println(result);
    }
    static List<String> getSubsequence(String str){

        List<String> outer = new ArrayList<>();  // declare the new list named outer
        outer.add("");

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            int currentSize = outer.size();

            for (int j=0; j<currentSize; j++){
                String newCombination = (outer.get(j) + ch);
                outer.add(newCombination);
            }
        }
        return outer;
    }
}
