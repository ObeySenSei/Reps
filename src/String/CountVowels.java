package String;

public class CountVowels {
    public static void main(String[] args) {
        String str = "Education";
        System.out.println(countVowels(str));
    }
    static int countVowels (String str){

        int count = 0;

        for (int i=0; i<str.length(); i++){

            char ch = str.charAt(i);
            ch = Character.toLowerCase(str.charAt(i));        // covert characters to lowercase

            if (ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
                count++;
            }
        }
        return count;
    }
}




/*

Declaring a character from a String

Suppose you have: String s = "education"
To get a single character from the String, use charAt(index):
char ch = s.charAt(0);
System.out.println(ch);

 */
