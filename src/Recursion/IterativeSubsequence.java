package Recursion;
import java.util.ArrayList;

public class IterativeSubsequence {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> result = getSubsequences(str);
        System.out.println(result);
    }

    static ArrayList<String> getSubsequences(String str) {
        ArrayList<String> outer = new ArrayList<>();

        /// Step 1: Start with an empty string in the list
        outer.add("");

        /// Step 2: Loop through every character of the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            /// We store the current size because we are going to add elements to 'outer' inside this loop. We don't want an infinite loop!
            int currentSize = outer.size();

            /// Step 3: Take every existing element, append 'ch', and add it back
            for (int j = 0; j < currentSize; j++) {
                String newCombination = outer.get(j) + ch;
                outer.add(newCombination);
            }
        }

        return outer;
    }
}
/**
 🚀 STARTING STATE (Before the loop begins)
 ┌─────────────────────────────────────────────────────────┐
 │ outer = [ "" ]                                          │
 └─────────────────────────────────────────────────────────┘
 │
 ▼
 -----------------------------------------------------------
 🔄 ITERATION 1: Processing character 'ch = 'a''
 -----------------------------------------------------------
 Current List Size = 1 (We look at index 0)

 • Copy outer.get(0) [ "" ]  ──> Add 'a' ──> Creates: "a"

 ┌─────────────────────────────────────────────────────────┐
 │ outer = [ "", "a" ]   (List doubled in size!)           │
 └─────────────────────────────────────────────────────────┘
 │
 ▼
 -----------------------------------------------------------
 🔄 ITERATION 2: Processing character 'ch = 'b''
 -----------------------------------------------------------
 Current List Size = 2 (We only loop through what's ALREADY there: "" and "a")

 • Copy outer.get(0) [ ""  ] ──> Add 'b' ──> Creates: "b"
 • Copy outer.get(1) [ "a" ] ──> Add 'b' ──> Creates: "ab"

 ┌─────────────────────────────────────────────────────────┐
 │ outer = [ "", "a", "b", "ab" ]  (List doubled again!)   │
 └─────────────────────────────────────────────────────────┘
 │
 ▼
 -----------------------------------------------------------
 🔄 ITERATION 3: Processing character 'ch = 'c''
 -----------------------------------------------------------
 Current List Size = 4 (We loop through the 4 existing elements)

 • Copy outer.get(0) [ ""   ] ──> Add 'c' ──> Creates: "c"
 • Copy outer.get(1) [ "a"  ] ──> Add 'c' ──> Creates: "ac"
 • Copy outer.get(2) [ "b"  ] ──> Add 'c' ──> Creates: "bc"
 • Copy outer.get(3) [ "ab" ] ──> Add 'c' ──> Creates: "abc"

 ┌─────────────────────────────────────────────────────────────────────────┐
 │ outer = [ "", "a", "b", "ab", "c", "ac", "bc", "abc" ]  🏆 FINAL LIST   │
 └─────────────────────────────────────────────────────────────────────────┘


 💡 Why currentSize protects the loop:
 Notice how in Iteration 2, the list size is 2 (["", "a"]). The inner loop runs only 2 times.

 If you didn't save currentSize = outer.size(), and instead wrote for (int j = 0; j < outer.size(); j++),
 the loop would keep chasing its own tail as you add items, running forever into an infinite loop!

 Saving currentSize draws a strict line: "Only copy the old stuff, don't touch the new stuff we are currently adding."

 */