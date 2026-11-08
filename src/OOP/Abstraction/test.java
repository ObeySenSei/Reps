package OOP.Abstraction;

interface Payment1{
    void pay (double amount);  // We declare a method but don't provide its implementation. The interface simply establishes a contract.
}
class UPIPayment1 implements Payment1{

    @Override
    public void pay(double amount){
        System.out.println("Paying " + amount + " through UPI");
    }
}
class CardPayment1 implements Payment1{

    @Override
    public void pay(double amount){
        System.out.println("Paying " + amount + " through Card");
    }
}
public class test {
    public static void main(String[] args) {

        Payment1 p1 = new UPIPayment1();
        Payment1 p2 = new  CardPayment1();

        p1.pay (40000);
        p2.pay(50000);

    }
}
