package StringBuilder;

public class SBConcepts {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");

        System.out.println(sb);         // append() modifies the builder itself.

        String str = "Hello";
        str = str + " World";
        System.out.println(str);       // for string

        StringBuilder sb1 = new StringBuilder("Jva");
        sb1.insert(1, 'a');                      // only need the index and char to be inserted
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("abcde");
        sb2.delete(1, 4);                                 // deletes char at index
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("hello");
        sb3.deleteCharAt(1);
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("hello");   // Indexes 1, 2, and 3 (ell) are replaced with "ipp".
        sb4.replace(1, 4, "ipp");
        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder("hello");
        sb5.reverse();
        System.out.println(sb5);


        StringBuilder sb6 = new StringBuilder("hello");
        char ch = sb6.charAt(0);          // 'h'
        sb6.setCharAt(0, Character.toUpperCase(ch));
        System.out.println(sb6);          // Hello


        StringBuilder sb7 = new StringBuilder("hello");
        String str7 = sb7.toString();


        StringBuilder a = new StringBuilder("java");
        StringBuilder b = new StringBuilder("java");
        System.out.println(a == b);
        System.out.println(a.equals(b));

    }


}


