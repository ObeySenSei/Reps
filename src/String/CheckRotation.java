package String;

public class CheckRotation {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdab";
        boolean isRotation = checkRotation(a,b);
        System.out.println(isRotation);
    }
    static boolean checkRotation (String a ,String b){

        if (a.length()==b.length()){
            return false;
        }

        String str = a + a;        // This gives us " abcdabcd"

        if(str.contains(b)){
            return true;
        } else {
            return false;
        }
    }
}

/*
A string is a rotation of another string if we take some characters from the beginning and move them to the end,
without changing their relative order.

For example, "abcd" has these rotations:
Original             abcd
Move a to the end    bcda
Move ab to the end   cdab
Move abc to the end  dabc
 */
