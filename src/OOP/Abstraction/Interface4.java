package OOP.Abstraction;    ///    Interface Reference and Runtime Polymorphism.

interface Animal1 {
    abstract void sound();

}
class Dog implements Animal1{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}

class Cat implements Animal1{
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Cow implements Animal1{
    @Override
    public void sound(){
        System.out.println("Cow hums");
    }
}

public class Interface4 {
    public static void main(String[] args) {

        Animal1 a1 = new Dog();     // Reference type = Animal      Actual Object = Dog
        Animal1 a2 = new Cat();
        Animal1 a3 = new Cow();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}
/**

 We are using an interface reference to refer to an object of a class that implements it. This is called upcasting.

 a1.sound();
 Java executes the sound() implementation belonging to Dog, not some generic implementation in Animal.
 That's runtime polymorphism.

 Runtime polymorphism - Java executes the actual object's sound() method
 */
