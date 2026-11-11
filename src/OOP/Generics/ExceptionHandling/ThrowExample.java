package OOP.Generics.ExceptionHandling;

public class ThrowExample {
    public static void main(String[] args) {

        int age = 17;

        try {
            if (age < 18) {
                throw new ArithmeticException("Not eligible to vote");
            }

            System.out.println("Eligible to vote");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

//  The throw keyword is used to explicitly throw an exception.