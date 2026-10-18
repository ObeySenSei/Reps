package StringBuilder;

public class Capitalize {
    public static void main(String[] args) {
        String str = "hello world";
        capitalizeStr(str);
        System.out.println(capitalizeStr(str));

    }
    static String capitalizeStr (String str){
        if (str == null || str.isEmpty()){
            return str;
        }

        StringBuilder sb = new StringBuilder(str);

        int index = 0;

        char upper = Character.toUpperCase(sb.charAt(index));  // sb.charAt(index) means sb.charAt(0) — get 'h'.
        sb.setCharAt(index,upper);

        return sb.toString();
    }
}
/*
 Character.toUpperCase(...) converts 'h' into 'H'.
 sb.setCharAt(index, upper) means sb.setCharAt(0, 'H') — replace 'h' with 'H'.
 */
