package Recursion.SubsetsSubsequenceStringQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterCombinationArrayList {
    static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        ArrayList<String> result = findCombinations(str,"");   /// Here ans will initially be empty
        System.out.println(result);
        in.close();
    }
    static ArrayList<String> findCombinations (String str,String ans){

        ArrayList<String> list = new ArrayList<>();

        if(str.length() == 0){           /// or str.isEmpty()
            list.add(ans);
            return list;
        }
        String key = keypad[str.charAt(0) - 48];          /// or    keypad[str.charAt(0) - '0']
        for (int i=0; i<key.length(); i++){
            list.addAll(findCombinations(str.substring(1),ans + key.charAt(i)));
        }
        return list;
    }
}
