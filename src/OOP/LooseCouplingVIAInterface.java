package OOP;
interface Payment {
    void pay();
}
class PayPal implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment through PayPal");
    }
}

class Razorpay implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment through Razorpay");
    }
}

class ShoppingCart {
    private Payment payment; // ShoppingCart stores a reference of type Payment. Instead of depending on a specific implementation.

    ShoppingCart(Payment payment) {   // Constructor Injection
        this.payment = payment;
    }
    void checkout() {
        payment.pay();
    }
}

public class LooseCouplingVIAInterface {

    public static void main(String[] args) {
        Payment p1 = new PayPal();                      // Payment using PayPal
        ShoppingCart cart1 = new ShoppingCart(p1);

        cart1.checkout();

        Payment p2 = new Razorpay();                    // Payment using Razorpay

        ShoppingCart cart2 = new ShoppingCart(p2);
        cart2.checkout();
    }
}



