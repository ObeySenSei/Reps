package OOP.Inheritance;

/**           Program 2: Calling the parent constructor using super()
       Concepts: Constructor chaining + Parameterized constructors + Inheritance.        */

class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parent constructor called");
    }
}

class Student2 extends Person2 {

    int rollNo;
    Student2(String name, int age, int rollNo) {

        super(name, age);        /// Calling parent constructor
        this.rollNo = rollNo;
        System.out.println("Child constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNo);
    }
}

public class SuperKeyword2 {
    public static void main(String[] args) {

        Student2 s1 = new Student2("Debanga", 26, 18);
        System.out.println();
        s1.display();

    }
}