package OOP;

final class Student11 {       /// Final Class: Cannot be inherited

    String name;
    final int rollNo = 101;   /// Final Variable: Cannot be reassigned

    Student11(String name) {
        this.name = name;
    }

    final void display() {                           /// Final Method: Cannot be overridden
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    void show() {
        System.out.println("This is a normal method.");
    }
}

public class FinalClass {
    public static void main(String[] args) {

        Student11 s1 = new Student11 ("Debanga");

        s1.display();
        s1.show();

        // Cannot modify a final variable
        // s1.rollNo = 102; // Compilation Error

        // Cannot override a final method
        // Cannot extend Student11 because it is a final class
    }
}
