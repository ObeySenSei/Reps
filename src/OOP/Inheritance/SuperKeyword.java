package OOP.Inheritance;

/** Program 1: Accessing parent variables and methods using super
 Concepts: Variable hiding + Method overriding.          */

class Parent1 {
    int value = 100;

    void display() {
        System.out.println("Parent class method");
    }
}
class Child1 extends Parent1 {
    int value = 200;

    @Override
    void display() {
        System.out.println("Child class method");
        System.out.println("Parent value: " + super.value);     /// Accessing parent class variable
        super.display();                                       /// Accessing parent class method
    }
    void show() {
        System.out.println("Child value: " + value);
        System.out.println("Parent value: " + super.value);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {

        Child1 obj = new Child1();

        obj.show();
        System.out.println();
        obj.display();
    }
}

/**
 *
 What you should understand:
 - value refers to the child class variable.
 - super.value explicitly accesses the parent class variable.
 - super.display() calls the parent implementation, even though the child has overridden that method.

 */