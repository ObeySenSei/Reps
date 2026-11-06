package OOP.Inheritance;

                          ///   Concept: Reference type vs actual object type.
class Parent {
    int value = 10;

    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    int value = 20;                 /// Field hiding: A child class declares a variable with the same name as its parent class.

    @Override
    void show() {
        System.out.println("Child method");
    }
}
public class FieldHidingVSMethodOverriding {
    public static void main(String[] args) {
        Parent obj = new Child();

        System.out.println(obj.value);
        obj.show();
    }
}
/**

 When you write:    Parent obj = new Child();

 The variable obj is declared as type Parent.
 Java uses the reference type to decide which field to access.
 So it accesses Parent.value, which is 10.


 2. Why does obj.show() print Child method?
 Unlike fields, overridden instance methods behave differently.
 class Parent {
 void show() {
 System.out.println("Parent method");
 }

 class Child extends Parent {
@Override
void show() {
System.out.println("Child method");
}

 The actual object created is:   new Child()

 Therefore, Java executes the overridden show() method inside Child.
 The important distinction
 What you're accessing	What Java uses
 Instance variable (value)	Reference type
 Overridden instance method (show())	Actual object type

 This is called field hiding vs method overriding.


 */
