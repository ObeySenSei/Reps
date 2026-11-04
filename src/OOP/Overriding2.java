package OOP;

public class Overriding2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
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

