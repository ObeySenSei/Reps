package OOP;

public class WrapperClasses {
    public static void main(String[] args) {


        int a = 10;          /// 1. Primitive variable

        Integer b = a;       /// 2. Wrapper class object (Autoboxing)

        int c = b;           /// 3. Unboxing


        String str = "100";
        int num = Integer.parseInt(str);       ///  4. Converting String to primitive int

        String result = Integer.toString(a);   /// 5. Converting primitive int to String

        // Display results
        System.out.println("Primitive value: " + a);
        System.out.println("Wrapper object: " + b);
        System.out.println("Unboxed value: " + c);
        System.out.println("String to int: " + num);
        System.out.println("Int to String: " + result);
    }
}

