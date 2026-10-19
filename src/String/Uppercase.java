package String;

public class Uppercase {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(toUpperCase(str));
    }
    static String toUpperCase (String str){

        String str2 = "";

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
                ch = (char) (ch - 32);           // double two brackets
            }
            str2 = str2 + ch;
        }
        return str2;
    }
}

/*
Yes! ✅ You should use a for loop because you need to visit each character in the string and convert it individually.

In Java, lowercase and uppercase English letters have a difference of 32 in their character codes.
For example:
- 'a' → 97
- 'A' → 65
- Difference: 97 - 65 = 32


static String toUpperCase(String str) {
    String str2 = "";

    for (i = 0; i < str.length(); i++)
        char ch = str.charAt(i);

        ch = Character.toUpperCase(ch);
        str2 = str2 + ch;

    return str2;


 */