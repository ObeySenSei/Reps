package OOP;

class BankAccount {

    private double balance;                /// 1. Private field (Data Hiding)

    public double getBalance() {           /// 2. Public Getter method to read the balance safely
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {                 /// 3. Public Setter method to modify the balance with validation logic
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
}
public class GettersSetters2 {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        myAccount.deposit(250.0);
        System.out.println("Current Balance: $" + myAccount.getBalance());

        // myAccount.balance = 500.0; // COMPILE ERROR! Cannot access private field directly.
        // Correct way: Using public methods to interact with the data


    }
}
