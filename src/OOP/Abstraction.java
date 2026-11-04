package OOP;

abstract class Animal2 {
    abstract void walk();
}

class Horse extends Animal2{
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal2{
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse  = new Horse();
        horse.walk();

        Chicken chicken = new Chicken();
        chicken.walk();
    }
}
