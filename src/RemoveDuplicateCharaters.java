public class RemoveDuplicateCharaters {
    public static void main(String[] args) {
        String str = "banana";
        String result = removeDuplicates(str);
        System.out.println(result);

    }
    static String removeDuplicates (String str){

        String copy = "";

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);                    // first character is automatically considered new

            boolean alreadySeen = false;

            for (int j=0; j<i; j++){                // is  0 < 0, False. 1st char is already appended to...String copy = 'b'
                if (ch == str.charAt(j)){
                    alreadySeen = true;
                    break;
                }
            }
            if (!alreadySeen){                // if (alreadySeen == false) , then
                copy = copy + ch;
            }
        }
        return copy;
    }
}

/*
There are two loops, but they have different jobs.
- The outer loop (i) selects the current character.
- The inner loop (j) checks whether that character appeared before the current index.

Why j < i instead of j < s.length() ?
Because we only need to check the characters we've already passed.
We don't want to check the current character against itself or look ahead.

3. Trace "banana"
i	ch	Previously seen?	result
0	'b'	No	"b"
1	'a'	No	"ba"
2	'n'	No	"ban"
3	'a'	Yes	"ban"
4	'n'	Yes	"ban"
5	'a'	Yes	"ban"
When i = 0, the inner loop doesn't run at all because j = 0 and 0 < 0 is false.
So the first character is automatically considered new.

When a duplicate is found:
alreadySeen = true;
break;

Remember: break exits the inner loop, while !alreadySeen ensures that only the first occurrence
of each character is added to result.

 */
