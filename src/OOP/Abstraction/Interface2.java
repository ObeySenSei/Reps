package OOP.Abstraction;

interface Payment1{
    abstract void pay(double amount); // We don't need to write abstract explicitly. Interface methods are implicitly abstract (unless they're default, static or private methods).
}                                    // It only declares what a payment method must do. It doesn't provide the actual implementation.

class CreditCard implements Payment1{
    @Override
    public void pay(double amount){
        System.out.println("Paid using credit card: " + amount);
    }
}

class UPI implements Payment1{
    @Override
    public void pay(double amount){
        System.out.println("Paid using UPI: " + amount);
    }
}

class Netbanking implements Payment1{
    @Override
    public void pay(double amount){
        System.out.println("Paid using Netbanking: " + amount);
    }
}

public class Interface2 {
    public static void main(String[] args) {

        CreditCard c1 = new CreditCard();
        UPI u1 = new UPI ();
        Netbanking n1 = new Netbanking();

        c1.pay(20000);
        u1.pay(40000);
        n1.pay(60000);

        /// One more thing — Bonus challenge!   Instead of creating references using the individual classes:

        Payment1 p1 = new CreditCard();
        Payment1 p2 = new UPI();
        Payment1 p3 = new Netbanking();

        p1.pay(20000);
        p2.pay(40000);
        p3.pay(60000);   ///  This demonstrates runtime polymorphism using interfaces.
    }
}
