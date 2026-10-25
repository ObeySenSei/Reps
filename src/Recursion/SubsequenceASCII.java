package Recursion;

import java.util.ArrayList;

public class SubsequenceASCII {
    public static void main(String[] args) {
        ArrayList<String> allSubsequences = getSubsequenceASCII("", "abc");
        System.out.println(allSubsequences);
    }

    static ArrayList<String> getSubsequenceASCII(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ///  Exclude the character
        ArrayList<String> first = getSubsequenceASCII(p, up.substring(1));
        ///  Include the character itself
        ArrayList<String> second = getSubsequenceASCII(p + ch, up.substring(1));
        ///  Include the ASCII value of the character
        ArrayList<String> third = getSubsequenceASCII(p + (int) ch, up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
/**

 2. Simple void Printing Version (Matching your very first snippet)
 Java
 public class PrintSubsequenceASCII {
 public static void main(String[] args) {
 printSubAscii("", "abc");
 }

 static void printSubAscii(String p, String up) {
 if (up.isEmpty()) {
 System.out.println(p);
 return;
 }

 char ch = up.charAt(0);

 printSubAscii(p, up.substring(1));         // Exclude
 printSubAscii(p + ch, up.substring(1));     // Include character
 printSubAscii(p + (int) ch, up.substring(1)); // Include ASCII value
 }
 }

 */