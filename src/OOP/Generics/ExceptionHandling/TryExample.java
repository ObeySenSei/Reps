package OOP.Generics.ExceptionHandling;

public class TryExample {
    public static void main(String[] args) {

        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

//   The try block contains code that might generate an exception.