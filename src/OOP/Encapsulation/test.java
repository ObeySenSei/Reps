package OOP.Encapsulation;

class User1{
    private String username;
    private String password;

    public User1(String username, String password){
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String oldPass, String newPass){
        if(password.equals(oldPass)){
            password = newPass;
            System.out.println("Password was changed successfully");
        } else {
            System.out.println("Error");
        }
    }
    public boolean verify(String enteredPass){
        return password.equals(enteredPass);
    }
}
public class test{
    public static void main(String[] args) {
        User1 u1 = new User1 ("Debanga", "12345");
        System.out.println(u1.verify("12345"));

        u1.setPassword("12345","67890");
        System.out.println(u1.verify("67890"));

        System.out.println(u1.getUsername());


    }
}