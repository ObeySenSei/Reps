package OOP.Generics.ExceptionHandling;

public class FinallyExample {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled!");
        }
        finally {
            System.out.println("Finally block executed!");
        }
    }
}

//  The finally block normally executes whether an exception occurs or not. It is commonly used for cleanup operations.