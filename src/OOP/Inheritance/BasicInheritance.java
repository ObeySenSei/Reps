package OOP.Inheritance;

class Animal{
    String name;

    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class BasicInheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();

        d1.name = "Bruno";
        System.out.println(d1.name);
    }
}
/**

 Why does this work even though name was never declared inside Dog?
 Because Dog inherits the accessible instance fields of Animal.

 */