package OOP;

class BankAccount1{
    String accountHolder;
    int accountNum;
    double balance;

    /// Central constructor: initializes all instance variables
    BankAccount1(String accountHolder, int accountNum, double balance){
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }
    BankAccount1 (String accountHolder, int accountNum){
        this(accountHolder,accountNum,1000.0);
    }
    BankAccount1(){
        this("Unknown", 0, 0.0);
    }
    public void display(){
        System.out.println("Account: " + accountHolder + " Account No. " + accountNum + " Balance: " + balance);
    }
}

public class ConstructorChaining2 {
    public static void main(String[] args) {

        BankAccount1 acc = new BankAccount1("Debashis" , 101, 50000.0);
        BankAccount1 acc2 = new BankAccount1("Debanga" , 102);
        BankAccount1 acc3 = new BankAccount1();

        BankAccount1[] accounts = {acc,acc2,acc3};

        for (BankAccount1 p : accounts ){
            p.display();
        }
        accounts[1].display();
    }
}

/**

 The 3-parameter constructor should perform the actual initialization using this.variable = parameter.

 You wrote:
 BankAccount1(String accountHolder, int accountNum, double balance){
 this(accountHolder, accountNum, balance);
 }

 This constructor is calling itself with the exact same arguments.
 That creates infinite constructor recursion. Java will reject it with a compile-time error
 because the recursive constructor invocation is not allowed.



 for (int i = 0; i < employees.length; i++) {
 Employee s = employees[i];
 s.display();
 }

 */
