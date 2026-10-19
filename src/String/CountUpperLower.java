package String;

public class CountUpperLower {
    public static void main(String[] args) {
        String str = "HeLlo";
        countUL(str);

    }
    static void countUL(String str){
        int countUpper = 0;
        int countLower = 0;

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <='Z'){
                countUpper++;
            } else if (ch >= 'a' && ch<= 'z'){
                countLower++;
            }
        }
        System.out.println("Total LowerCase letters: " + countLower);
        System.out.println("Total UpperCase letters: " + countUpper);
    }
}
