package StringBuilder;

public class Q1 {
    public static void main(String[] args) {

        int n = 1234;
        System.out.println(reverseDigits(n));
    }

    static String reverseDigits(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int digit = n % 10;
            sb.append(digit);        // instead of using   remainder = 0 * 10 + digit
            n = n / 10;
        }
        return sb.toString();        // converts the StringBuilder into a String return type
    }
}



/*  Build a reversed numeric string using StringBuilder
Your method must:
1. Create a StringBuilder.
2. Convert the integer into a sequence of digit characters and append them to the builder.
3. Reverse the builder.
4. Return the result as a String.    */
