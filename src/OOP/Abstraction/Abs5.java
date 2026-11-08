package OOP.Abstraction;     // Concept: Combining abstraction, encapsulation, inheritance, method overriding and Constructor chaining.

abstract class ATM {

    private double balance;    /// private instance variables because we don't want external classes to modify these variables (Encapsulation)
    private int pin;

    ATM(double balance, int pin) {                           /// Constructor
        this.balance = balance;
        this.pin = pin;
    }

    protected boolean validatePin(int enteredPin) {          ///  PIN validation
        return this.pin == enteredPin;
    }

    abstract void withdraw(double amount, int enteredPin);   /// Abstract methods
    abstract void checkBalance(int enteredPin);


    protected void updateBalance(double amount) {
        balance = balance - amount;
    }  // Protected method to update balance

    protected double getBalance() {
        return balance;                         ///  Getter - Returns current Balance.
    }
}

class SBIATM extends ATM {

    SBIATM(double balance, int pin) {
        super(balance, pin);
    }

    @Override
    void withdraw(double amount, int enteredPin) {

        if (!validatePin(enteredPin)) {
            System.out.println("Invalid PIN!");
            return;
        }

        if (amount > 0 && amount <= getBalance()) {
            updateBalance(amount);                     /// Method call

            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: " + getBalance());

        } else {
            System.out.println("Invalid Amount or Insufficient Balance");
        }
    }

    @Override
    void checkBalance(int enteredPin) {

        if (validatePin(enteredPin)) {
            System.out.println("Current Balance: " + getBalance());

        } else {
            System.out.println("Invalid PIN!");

        }
    }
}

public class Abs5 {
    public static void main(String[] args) {

        ATM atm = new SBIATM(10000, 1234);
        atm.checkBalance(1234);
        atm.withdraw(2000, 1234);
        atm.withdraw(1000, 9999);

    }
}