package String;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        String result = findDuplicates(str);
        System.out.println(result);
    }
    static String findDuplicates (String str){

        String copy = "";

        for (int i=0; i<str.length(); i++){             // Loop to compare an element
            int count = 0;
            char ch = str.charAt(i);

            for (int j=0; j <str.length(); j++){        // Count how many times a ch appears, to compare an element with another
                if (ch==str.charAt(j)){
                    count++;
                }
            }
            boolean alreadyseen = false;
            for (int k=0; k<i; k++){
                if (ch == str.charAt(k)) {
                    alreadyseen = true;
                    break;
                }
            }
            if (count > 1 && !alreadyseen){                        // meaning True. Execution continues after break.
                copy = copy + ch;
            }
        }
        return copy;
    }
}

