package OOP.Encapsulation;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void changePassword(String oldPassword, String newPassword) {

        if (password.equals(oldPassword)) {

            password = newPassword;
            System.out.println("Password changed successfully");

        } else {
            System.out.println("Incorrect old password");
        }
    }

    public boolean verifyPassword(String enteredPassword) {
        return password.equals(enteredPassword);
    }
}

public class Main4 {
    public static void main(String[] args) {

        User user = new User("Debanga", "12345");
        System.out.println(user.verifyPassword("12345"));

        user.changePassword("12345", "67890");
        System.out.println(user.verifyPassword("67890"));
    }
}