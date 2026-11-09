package OOP.Interface;

interface Bank {
    int RATE = 7;  // public static final implicitly  (public static final int RATE = 7)
}

class Customer {
    void showInterestRate() {
        System.out.println("Interest Rate: " + Bank.RATE);
    }
}

public class Main {
    public static void main(String[] args) {

        Customer c = new Customer();

        c.showInterestRate();
        System.out.println(Bank.RATE);
    }
}

//  Why? Because interface variables are implicitly final.