package StringBuilder;

public class Reverse {
    public static void main(String[] args) {
        String str = "Hello";
        String ans = reverse(str);
        System.out.println("The String in reverse: " + ans );
    }
    static String reverse (String str){
        if (str == null){
            return str;
        }
        StringBuilder sb = new StringBuilder (str);
        String reversed = sb.reverse().toString();

        return reversed;
    }
}
