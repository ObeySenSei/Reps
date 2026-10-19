package String;

public class CountWords {
    public static void main(String[] args) {
        String str = "Java is fun";                      //  For string use single,quotes ' '.
        int result = countW(str);
        System.out.println(result);

    }
    static int countW(String str){
        int count = 0;

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == ' '){                                //  For char use single,quotes ' '.
                count++;
            }
        }
        int words = 0;
        if (str.length() > 0){                  // to account for Empty Strings.    say 0 > 0 becomes False.
            words = count + 1;                  //   spaces + 1 gives us the total no. of words
        }
        return words;
    }
}
