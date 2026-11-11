package OOP.Generics.ExceptionHandling;

public class CatchExample {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed!");
        }

        System.out.println("Program continues...");
    }
}

//  The catch block handles an exception generated inside the try block.