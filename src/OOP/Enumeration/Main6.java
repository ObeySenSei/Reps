package OOP.Enumeration;

interface Payment {
    void pay();
}

enum PaymentMode implements Payment {

    CREDIT_CARD,
    UPI;

    @Override
    public void pay() {
        System.out.println("Processing payment...");
    }
}

public class Main6 {
    public static void main(String[] args) {

        PaymentMode mode = PaymentMode.UPI;
        mode.pay();
    }
}

