package OOP.Abstraction;

interface Animal{
    int eyes = 2;          /// This property of Animal class will be the same and cannot be changed
    public void walk();
}

interface Herbivore {        /// Multiple Interfaces
}

class Horsee implements Animal, Herbivore {
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
public class Interface {
    public static void main(String[] args) {
        Horsee horse = new Horsee ();
        horse.walk();
    }
}
