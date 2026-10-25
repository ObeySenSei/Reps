package Recursion;
import java.util.ArrayList;

public class IterativeSubsequenceChar {
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
            char ch = str.charAt(i);        ///   i = 0: ch = str.charAt(0) -> ch = 'a'     int num = arr[i] alternatively

            /// We store the current size because we are going to add elements to 'outer' inside this loop. We don't want an infinite loop!
            int currentSize = outer.size();

            /// Step 3: Take every existing element, append 'ch', and add it back
            for (int j = 0; j < currentSize; j++) {
                String newCombination = outer.get(j) + ch;      // first get the value
                outer.add(newCombination);                      // then add that value to outer list
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


 If you tried to get a character at index 4 (str.charAt(4)):
 For our current string "abc": Your program would crash with a StringIndexOutOfBoundsException.
 Why? Because "abc" only has 3 characters, meaning valid indices are only 0, 1, and 2.



 State of variables:
 str = "abc"
 outer = [""] (The list starts with just an empty string)
 Phase 1: Outer Loop - First Character (i = 0)
 i = 0: ch = str.charAt(0)  ch = 'a'
 int currentSize = outer.size();  currentSize is 1 (we freeze this limit).
 Inner Loop (j from 0 to < 1):
 j = 0:
 newCombo = outer.get(0) + ch  "" + 'a'  "a"
 outer.add("a")  Adds "a" to the list.
 End of Iteration 1:
 outer list is now: ["", "a"]
 Phase 2: Outer Loop - Second Character (i = 1)
 i = 1: ch = str.charAt(1)  ch = 'b'
 int currentSize = outer.size();  currentSize is now 2 (since the list currently has two items: "" and "a").
 Inner Loop (j from 0 to < 2):
 j = 0:
 newCombo = outer.get(0) + ch  "" + 'b'  "b"
 outer.add("b")  outer becomes ["", "a", "b"]
 j = 1:
 newCombo = outer.get(1) + ch  "a" + 'b'  "ab"
 outer.add("ab")  outer becomes ["", "a", "b", "ab"]
 End of Iteration 2:
 outer list is now: ["", "a", "b", "ab"]
 Phase 3: Outer Loop - Third Character (i = 2)
 i = 2: ch = str.charAt(2)  ch = 'c'
 int currentSize = outer.size();  currentSize is now 4 (["", "a", "b", "ab"]).
 Inner Loop (j from 0 to < 4):
 j = 0:
 newCombo = outer.get(0) + ch  "" + 'c'  "c"
 outer.add("c")  outer becomes ["", "a", "b", "ab", "c"]
 j = 1:
 newCombo = outer.get(1) + ch  "a" + 'c'  "ac"
 outer.add("ac")  outer becomes ["", "a", "b", "ab", "c", "ac"]
 j = 2:
 newCombo = outer.get(2) + ch  "b" + 'c'  "bc"
 outer.add("bc")  outer becomes ["", "a", "b", "ab", "c", "ac", "bc"]
 j = 3:
 newCombo = outer.get(3) + ch  "ab" + 'c'  "abc"
 outer.add("abc")  outer becomes ["", "a", "b", "ab", "c", "ac", "bc", "abc"]
 End of Iteration 3:
 outer list is now: ["", "a", "b", "ab", "c", "ac", "bc", "abc"]
 Phase 4: Termination & Output
 The outer loop tries to move to i = 3, but since 3 < str.length() (3 < 3) is false, the outer loop terminates.
 return outer; passes the final list back to main.
 System.out.println(result); prints:
 Plaintext
 [, a, b, ab, c, ac, bc, abc]



 */