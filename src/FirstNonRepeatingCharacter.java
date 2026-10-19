public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        char unique = checkUnique(str);
        if  (unique == '\0'){
            System.out.println("No such element exist");
        } else {
            System.out.println(unique);
        }
    }
    static char checkUnique (String str){

        for (int i=0; i<str.length(); i++){

            int count = 0;                             // Here we want the value of count to change for every character.
            char ch = str.charAt(i);

            for (int j=0; j<str.length(); j++){
                if (str.charAt(j) == ch){
                    count++;
                }
            }
            if (count==1){
                return ch;
            }
        }
        return '\0';
    }
}
