package String;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "Java is fun";                      //  For string use single,quotes ' '.
        String result = removeSpace(str);
        System.out.println(result);
    }
    static String removeSpace (String str){

        String copy = "";

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch != ' '){                 // Only when ch is != ' ' space, do we copy the words
                copy = copy + ch;
            }
        }
        return copy;
    }
}
