package Bank;

class Account {
    public String name;         /// Public Access Modifier. Will become Default if we remove Public keyword
    protected String email;
    private String password;    /// can only be accessed by 'Class Account'

    /// Getters and Setters (How to access a private value)
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String a){
        this.password = a;
    }
}

public class Bank1 {
    public static void main(String[] args) {
        Account account1 = new Account();           /// Create a new object

        account1.name = "Apna College";
        System.out.println("Account Name: " + account1.name);

        account1.email = "Dynamohazarika@gmail.com";
        System.out.println("Account Mail: " + account1.email);


        account1.setPassword("abcd");                 /// Not like this  account1.password = "abcd";
        System.out.println("Password : " + account1.getPassword());

    }
}
