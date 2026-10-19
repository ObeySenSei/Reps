package String;

public class Anagrams {
    public static void main(String[] args) {

        String a = "silent";
        String b = "listen";
        boolean result = checkAnagrams (a,b);
        System.out.println(result);
    }
    static boolean checkAnagrams (String a, String b){

        for (int i=0; i<a.length(); i++){
            int countA = 0;
            int countB = 0;
            char ch = a.charAt(i);                     // lets say   char ch = a.charAt(0) which is l

            for (int j=0; j<a.length(); j++){
                if (a.charAt(j) == ch){               // is l equal to l ? yes. count ++
                    countA++;
                }
                if (b.charAt(j) == ch){               // is s equal to l ? No. count stays 0.
                    countB++;
                }
            }
            if (countA != countB){         // In any point in time , if a single character has appeared more than
                return false;              // the same character in the other string, return false.
            }
        }
        return true;
    }
}
