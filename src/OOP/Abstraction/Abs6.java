package OOP.Abstraction;

abstract class ATTM {

    private double balance;
    private int pin;

    ATTM(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    protected boolean validatePin(int enteredPin) {
        if (enteredPin == pin) {
            return true;
        } else {
            return false;
        }
    }

    abstract void deposit(double amount, int enteredPin);
    abstract void withdraw(double amount, int enteredPin);
    abstract void checkBal(int enteredPin);


    /// Setters - We use setter methods to access those private variables.
    protected void updateBalance(double amount, boolean isDeposit) {  // VVI
        if (isDeposit) {
            balance = balance + amount;       // True gets executed here
        } else {
            balance = balance - amount;       // False gets executed here
        }
    }

    protected double getBalance() {
        return balance;
    }
}

class SBII extends ATTM {

    SBII(double balance, int pin) {
        super(balance, pin);  // Calling the parent constructor
    }

    @Override
    void deposit(double amount, int enteredPin) {
        if (!validatePin(enteredPin)) {
            System.out.println("Invalid Pin");
            return;
        }

        if (amount > 0) {
            updateBalance(amount, true);
            System.out.println("Your current Balance after Deposit: " + getBalance());
        } else {
            System.out.println("Invalid Amount");
        }
    }

    @Override
    void withdraw(double amount, int enteredPin) {
        if (!validatePin(enteredPin)) {
            System.out.println("Invalid Pin");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else if (amount > getBalance()) {
            System.out.println("Insufficient Balance");
        } else {
            updateBalance(amount, false);
            System.out.println("Your remaining balance: " + getBalance());
        }
    }

    @Override
    void checkBal(int enteredPin) {
        if (validatePin(enteredPin)) {
            System.out.println("Current Balance: " + getBalance());
        } else {
            System.out.println("Invalid Pin");
        }
    }
}

public class Abs6 {

    public static void main(String[] args) {

        ATTM a1 = new SBII(60000, 1234);

        a1.checkBal(1234);
        a1.deposit(10000, 1234);
        a1.withdraw(40000, 1234);
        System.out.println("Final Balance: " + a1.getBalance());

    }
}
