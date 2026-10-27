package Recursion.SubsetsSubsequenceStringQuestions;

import java.util.Scanner;

public class test {
    static String[] keypad = {"","","abc","def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String input = scan.next();

        possibleWords(input,"");
    }

    static void possibleWords (String input, String ans){
        if(input.isEmpty()){
            System.out.print(ans+ " ");
            return;
        }
        String key = keypad[input.charAt(0) - '0'];       /// or keypad[s.charAt(0) - 48]

        for (int i=0; i< key.length(); i++){
            possibleWords(input.substring(1), ans + key.charAt(i));

        }
    }
}
/**

 */