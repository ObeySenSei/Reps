package OOP;

public class WrapperClasses {
    public static void main(String[] args) {

        // 1. Primitive variable
        int a = 10;

        // 2. Wrapper class object
        Integer b = a;  // Autoboxing

        // 3. Unboxing
        int c = b;

        // 4. Converting String to primitive int
        String str = "100";
        int num = Integer.parseInt(str);

        // 5. Converting primitive int to String
        String result = Integer.toString(a);

        // Display results
        System.out.println("Primitive value: " + a);
        System.out.println("Wrapper object: " + b);
        System.out.println("Unboxed value: " + c);
        System.out.println("String to int: " + num);
        System.out.println("Int to String: " + result);
    }
}

