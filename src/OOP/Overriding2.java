package OOP;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Overriding the parent class method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Overriding2 {
    public static void main(String[] args) {
        Dog d = new Dog();                           ///  Animal myAnimal = new Dog(); // Upcasting
        d.sound();                                   /// myAnimal.sound(); Output: Dog barks (determined at runtime)
    }
}

