package Recursion;

public class RemoveStringReturnType {
    public static void main(String[] args) {
        String str = "bacapplecdh";
        System.out.println(skipString(str));
    }

    static String skipString(String str) {

        // Base case: If the string is empty, we are done
        if (str.isEmpty()) {
            return "";
        }

        /// Check if the current string starts with "apple"
        if (str.startsWith("apple")) {
            return skipString(str.substring(5));

        } else {
            /// If it doesn't start with "apple", keep the first character and check the rest
            return str.charAt(0) + skipString(str.substring(1));
        }
    }
}
/**
 *

 removeString("bacapplecdh")
 ├─ Does not start with "apple"
 removeString("acapplecdh")
 ├─ Does not start with "apple"
 removeString("capplecdh")
 ├─ Does not start with "apple"
 removeString("applecdh")
 ├─ 🎯 STARTS WITH "apple"! Skip 5 chars.
 removeString("cdh")
 ├─ Does not start with "apple"
 removeString("dh")
 ├─ Does not start with "apple"
 removeString("h")
 ├─ Does not start with "apple"
 removeString("")  <-- BASE CASE!

 Step 2: Draw the Upward Path : Once you hit the base case, draw arrows pointing back up.
 This shows the interviewer that you know values are being combined on the way out of the stack.

 removeString("")           ──Returns──>  ""
 removeString("h")          ──Returns──>  "h"         (keeps 'h' + "")
 removeString("dh")         ──Returns──>  "dh"        (keeps 'd' + "h")
 removeString("cdh")        ──Returns──>  "cdh"       (keeps 'c' + "dh")
 removeString("applecdh")   ──Returns──>  "cdh"       (skipped "apple", passed result straight up)
 removeString("capplecdh")  ──Returns──>  "ccdh"      (keeps 'c' + "cdh")
 removeString("acapplecdh") ──Returns──>  "accdh"     (keeps 'a' + "ccdh")
 removeString("bacapplecdh")──Returns──>  "baccdh"    (keeps 'b' + "accdh")


 */