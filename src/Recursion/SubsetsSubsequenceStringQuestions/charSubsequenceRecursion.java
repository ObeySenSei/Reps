package Recursion.SubsetsSubsequenceStringQuestions;

public class charSubsequenceRecursion {
    public static void main(String[] args) {
        printSubsequences("" , "abc");
        
    }
    static void printSubsequences(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        printSubsequences(p, up.substring(1));      /// Ignore/Exclude ch: You pass p as it is (leaving the current character out) and move on to the rest of up.
        printSubsequences(p + ch, up.substring(1));  ///Include/Take ch: You add ch to your processed string (p + ch) and move on to the rest of up.


    }
}
/**
 *
 This Java program uses recursion to generate and print all possible subsequences (often called subsets) of the string "abc".
 (Note: Even though the method is named printSubstring, it is technically generating subsequences — combinations of characters where
 order matters, but they don't have to be right next to each other in the original string).

 Here is a breakdown of how it works step by step.
 1. Understanding the Parameters
 The method takes two strings:
 p (Processed): This string holds the current combination or subset you are building as you go down the recursion tree.
 up (Unprocessed): This string holds the remaining characters from the original string that still need to be processed.
 2. The Core Logic (Two Choices per Character)
 At every single recursive step, the code extracts the first character of the unprocessed string (char ch = up.charAt(0);) and makes a binary choice:
 Ignore (Exclude) the character: It calls the function again without adding ch to p, and chops off the first character from up:
 Java
 printSubstring(p, up.substring(1));




 Take (Include) the character: It calls the function again with ch added to p, and chops off the first character from up:
 Java
 printSubstring(p + ch, up.substring(1));




 3. The Base Case
 Java
 if (up.isEmpty()){
 System.out.println(p);
 return;
 }

 When there are no characters left in the unprocessed string (up is empty), it means a complete choice path has been made. The code then prints whatever accumulated combination lives inside p.
 4. Step-by-Step Execution Tree for "abc"
 When printSubstring("", "abc") is called, it branches out like a tree:
 Plaintext
 printSub("", "abc")
 ├── Exclude 'a' ──> printSub("", "bc")
 │    ├── Exclude 'b' ──> printSub("", "c")
 │    │    ├── Exclude 'c' ──> printSub("", "")       ──> Prints: "" (empty line)
 │    │    └── Include 'c' ──> printSub("c", "")        ──> Prints: "c"
 │    └── Include 'b' ──> printSub("b", "c")
 │         ├── Exclude 'c' ──> printSub("b", "")        ──> Prints: "b"
 │         └── Include 'c' ──> printSub("bc", "")       ──> Prints: "bc"
 └── Include 'a' ──> printSub("a", "bc")
 ├── Exclude 'b' ──> printSub("a", "c")
 │    ├── Exclude 'c' ──> printSub("a", "")        ──> Prints: "a"
 │    └── Include 'c' ──> printSub("ac", "")       ──> Prints: "ac"
 └── Include 'b' ──> printSub("ab", "c")
 ├── Exclude 'c' ──> printSub("ab", "")       ──> Prints: "ab"
 └── Include 'c' ──> printSub("abc", "")      ──> Prints: "abc"

 5. Final Output
 Running this main method will print out all 23=8 possible subsequences of "abc" in this order:
 Plaintext

 c
 b
 bc
 a
 ac
 ab
 abc




 */