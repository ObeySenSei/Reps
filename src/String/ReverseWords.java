package String;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Java is fun";
        String reverse = doReverse (str);
        System.out.println(reverse);
    }
    static String doReverse(String str){
        String reverse = "";
        String word = "";

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (ch != ' '){
                word = ch + word;       // J + word....Then word becomes J ->  next  a + J = aJ
            } else {
                reverse = reverse + word + " ";
                word = "";                     // It resets word so we can start building the next word.
            }
        }
        reverse = reverse + word;
        return reverse;
    }
}
/*

What happens with the last word, "fun"?
The loop builds:
'f' → "f"
'u' → "uf"
'n' → "nuf"

There is no space after "fun", so the else block never executes for this word.
That means word is still "nuf" when the loop finishes.

That's why we write:
result = result + word;

Now:
result = "avaJ si nuf"

Remember the difference:
 word = ""; resets the temporary string when a space is encountered, ready for the next word.
 result = result + word; after the loop appends the final word.
 It has no trailing space to trigger the else block.
 */