package String;

public class CountChar {
    public static void main(String[] args) {
        String str = "banana";
        int ans = countChar(str,'a');
        System.out.println(ans);
    }
    static int countChar (String str , char target){

        int count = 0;

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == target){
                count++;
            }
        }
        return count;
    }
}
