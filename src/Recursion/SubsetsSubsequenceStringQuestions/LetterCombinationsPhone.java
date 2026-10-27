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

        if(s.isEmpty()){                          /// or   if(s.length() == 0)
            System.out.print(ans + " ");
            return;
        }
        String key = keypad[s.charAt(0) - 48];            /// or keypad[s.charAt(0) - 48]          key = lets say "ghi" or "pqrs"

        for (int i=0; i<key.length(); i++){                                                 /// it will go until the length of those words
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


 1. What does s.substring(1) do?

 In this context, s.substring(1) acts as your progress tracker for the recursion.
 What it does: It chops off the first character of the string s and returns everything that is left over.
 Example: If s is "34", s.substring(1) drops the '3' and returns "4".
 In the next step, if s is "4", s.substring(1) drops the '4' and returns "" (an empty string).


 Why it matters: It ensures the string shrinks with every recursive step so that it eventually becomes empty (s.isEmpty()),
 stopping the recursion from running forever.


 What does ans + key.charAt(i) do?
 This is how you build and grow your combination word step-by-step.
 ans: This is the accumulated word you have built so far (e.g., "d").
 key.charAt(i): This grabs a single letter from the current keypad options (e.g., if key is "ghi", key.charAt(0) is 'g').
 + (Concatenation): It glues the new letter onto the end of your accumulated answer.
 Example: If ans is "d" and you pick 'g', ans + key.charAt(i) combines them to form "dg",
 which is then passed down to the next recursive call.


 */