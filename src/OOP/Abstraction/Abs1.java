package OOP.Abstraction;

interface Payment {
    void pay(double amount);       //  We declare a method but don't provide its implementation. The interface simply establishes a contract.
}

class UPIPayment implements Payment {   // UPIPayment provides its own implementation of pay().

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " through UPI");
    }
}

class CardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " through Credit Card");
    }
}

public class Abs1 {

    public static void main(String[] args) {

        Payment p1 = new UPIPayment();          // Upcasting      Reference type: Payment     Actual object: UPIPayment
        Payment p2 = new CardPayment();         // Upcasting      Reference type: Payment     Actual object: CardPayment

        p1.pay(500);
        p2.pay(1000);
    }
}
/*
    We interact with the object through the Payment interface

    The user doesn't need to know how UPI or card processing works. They only need to know that a payment can be made.
    That's abstraction.
 */