package String;

public class RemoveVowels {
    public static void main(String[] args) {
        String str = "education";
        String result = removeV (str);
        System.out.println(result);
    }
    static String removeV (String str){

        String copy = "";
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){   // Also use !=  and &&   instead of  ||

                copy = copy + ch;
            }
        }
        return copy;
    }
}
/*
The key idea is: append a character to copy only if it is NOT a vowel.
 */
