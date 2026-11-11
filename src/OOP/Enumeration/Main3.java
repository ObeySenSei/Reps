package OOP.Enumeration;

enum PaymentStatus {

    PENDING("Payment is waiting"),
    SUCCESS("Payment completed"),
    FAILED("Payment unsuccessful");

    String message;

    PaymentStatus(String message) {
        this.message = message;
    }
    void displayMessage() {
        System.out.println(message);
    }
}

public class Main3 {
    public static void main(String[] args) {

        PaymentStatus status = PaymentStatus.SUCCESS;
        status.displayMessage();
    }
}