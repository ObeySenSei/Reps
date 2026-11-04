package Bank;

public class Oops {
    public static void main(String[] args) {
        Bank.Account acc = new Bank.Account();
        acc.name = "Customer X";

        System.out.println("Assigned Name: " + acc.name);
    }
}