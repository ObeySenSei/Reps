package String;

public class LargestPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println(longestPrefix(words));
    }
    static String longestPrefix (String[] words){
        String prefix = "";

        for (int i=0; i< words[0].length(); i++){      // i selects the first letter from the first word.
            char ch = words[0].charAt(i);              // ch[0] = f, first word of flower

            for(int j=1; j<words.length; j++) {      // j selects the 2 word.   till the array length,i.e, till flight.
                if (i >= words[j].length() || words[j].charAt(i) != ch) {
                    return prefix;
                }
            }
            prefix = prefix + ch;
        }
        return prefix;
    }
}
/*

Why do we need the inner loop?
for (int j = 1; j < words.length; j++)

The first word is our reference. The inner loop checks every other word against the current character.

For example, when i = 2:
ch = 'o';

words[1].charAt(2) == 'o'  // matches
words[2].charAt(2) == 'i'  // doesn't match

Since 'i' != 'o', we immediately return the prefix we've built so far: "fl".

Step 3: Why check i >= words[j].length() ?
if (i >= words[j].length() || words[j].charAt(i) != ch)

Suppose the input is {"car", "ca"}. At index 2, the second word has no character.
The length check prevents an IndexOutOfBoundsException.

Java's || operator short-circuits: if the first condition is true, it won't evaluate words[j].charAt(i).

 */
