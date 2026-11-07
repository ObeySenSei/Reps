package OOP.Encapsulation;

class Bank {
    private String accountHolder;                /// Private instance variables
    private double balance;

    public Bank(String accountHolder, double balance){      /// Constructor
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance(){                          /// Getter
        return balance;
    }
    public void deposit(double amount){              /// Setter
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposited amount: " + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }
    public void withdrawal(double amount){
        if (amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("Withdrawn Amount: " + amount);
        } else {
            System.out.println("Insufficient balance or Invalid Amount");
        }
    }
}
public class Main2 {
    public static void main(String[] args) {
        Bank account = new Bank ("Debojyoti", 50000);

        account.deposit(20000);
        account.withdrawal(35000);

        System.out.println(account.getBalance());
    }
}
