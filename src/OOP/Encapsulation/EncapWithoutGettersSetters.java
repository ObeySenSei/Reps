package OOP.Encapsulation;            //   Encapsulation Without Getters and Setters

class BankAccount {

    private double balance;                   /// Private variable


    BankAccount(double balance) {             /// Constructor
        this.balance = balance;
    }

    public void deposit(double amount) {      /// Deposit money
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {           /// Withdraw money
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class EncapWithoutGettersSetters {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(10000);

        account.displayBalance();
        account.deposit(5000);
        account.withdraw(2000);

        account.displayBalance();
    }
}


/**

 balance is private.
 Nobody can directly modify balance from outside.
 deposit() and withdraw() provide controlled operations.
 There are no getters or setters.

 */
