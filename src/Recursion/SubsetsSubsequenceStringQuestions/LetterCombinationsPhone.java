package Recursion.SubsetsSubsequenceStringQuestions;
import java.util.Scanner;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

public class LetterCombinationsPhone {
    static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String s = scan.next();
        possibleWords(s,"");
        scan.close();
    }
    static void possibleWords(String s, String ans){

        if(s.isEmpty()){
            System.out.print(ans + " ");
            return;
        }
        String key = keypad[s.charAt(0) - 48];

        for (int i=0; i<key.length(); i++){
            possibleWords(s.substring(1),ans + key.charAt(i));
        }
    }
}
/**

 If s is "23":
 s.charAt(0) gets '2'.
 '2' - 48 turns it into integer 2.
 keypad[2] fetches "abc".
 key becomes "abc".

 */