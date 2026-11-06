package OOP.staticEx;

class Student {

    /// Non-static (Instance) variables
    String name;
    int age;

    Student(String name, int age) {          // Constructor
        this.name = name;
        this.age = age;
    }

    /// Static method
    static void display() {

        /// 1. Creating an object inside the static method      or     we can make the instance variables Static.
        Student s1 = new Student("Debanga", 26);

        // Accessing non-static variables using the object
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}

public class Main1 {
    public static void main(String[] args) {

        // Calling static method using class name
        Student.display();

    }
}

/** Since a static method cannot directly access instance variables, we create an object inside it.
    Now we can access the non-static variables using the object reference s1. */