package OOP.Generics.ExceptionHandling;

public class ThrowsExample {

    static void withdraw(int balance, int amount) throws Exception {

        if (amount > balance) {
            throw new Exception("Insufficient balance!");
        }
        System.out.println("Withdrawal successful!");
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 7000);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

// 'throws' declares that the method may throw an exception. The caller must handle it or declare it further.