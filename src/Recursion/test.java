package Recursion;

public class test {
    public static void main(String[] args) {
        printSubsequence ("", "abc");
    }
    static void printSubsequence(String p, String up){
        if (up.isEmpty()){   // if unprocessed String becomes empty
            System.out.println(p); // print the elements in String p
            return;
        }
        char ch = up.charAt(0);   // choose the first character in String up

        printSubsequence(p,up.substring(1));         // ignore certain characters in up but contain processed
        printSubsequence(p + ch, up.substring(1));   // contain some characters but
    }
}
