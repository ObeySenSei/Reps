package String;

public class CheckRotationForLoop {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdab";
        boolean isRotation = checkRotation(a,b);
        System.out.println(isRotation);
    }
    static boolean checkRotation (String a, String b){
        if (a.length() != b.length()){
            return false;
        }
        String str = a + a;
        for (int i=0; i <= str.length() - b.length(); i++){

            int j;
            for (j=0; j<b.length(); j++){
                if (str.charAt(i+j) != b.charAt(j)){
                    break;
                }
            }
            if (j==b.length()){
                return true;
            }
        }
        return false;
    }
}

 /*

  */