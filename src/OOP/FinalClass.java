package OOP;

final class Student11 {       /// Final Class: Cannot be inherited by another class. We can still create objects of it.

    String name;
    final int rollNo = 101;   /// Final Variable: Once initialized, its value cannot be reassigned.

    Student11(String name) {
        this.name = name;
    }

    final void display() {                           /// Final Method: A child class cannot override this method.
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

        /// s1.rollNo = 102 would produce a Compilation Error

        /** Cannot override a final method. Trying to override display() will cause a compilation error
            void display() {
                System.out.println("Child class method");
            }
         */
    }
}
