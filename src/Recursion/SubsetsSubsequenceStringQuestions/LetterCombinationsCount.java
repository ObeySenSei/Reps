package Recursion.SubsetsSubsequenceStringQuestions;
import java.util.Scanner;

public class LetterCombinationsCount {
    static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        possibleWords(s, "");
        System.out.println();

        // Calling the new count method
        int totalCount = countPossibleWords(s);
        System.out.println("Total count: " + totalCount);

        scan.close();
    }

    // Original method to print words
    static void possibleWords(String s, String ans) {
        if (s.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        String key = keypad[s.charAt(0) - 48];

        for (int i = 0; i < key.length(); i++) {
            possibleWords(s.substring(1), ans + key.charAt(i));
        }
    }

    // New method to return the count of possible combinations
    static int countPossibleWords(String s) {
        if (s.isEmpty()) {
            return 1; // Base case: 1 valid combination found
        }

        int count = 0;
        String key = keypad[s.charAt(0) - 48];

        for (int i = 0; i < key.length(); i++) {
            count += countPossibleWords(s.substring(1));
        }
        return count;
    }
}
