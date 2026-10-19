package String;

public class CountDigitS {
    public static void main(String[] args) {
        String str = "abc123de4";
        int ans = countD(str);
        System.out.println(ans);
    }
    static int countD (String str){

        int count = 0;

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9'){
                count++;
            }
        }
        return count;
    }
}
