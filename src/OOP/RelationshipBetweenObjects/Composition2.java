package OOP.RelationshipBetweenObjects;

class Engine {
    void start(){
        System.out.println("Engine is starting");
    }
}
class Car{
    private Engine engine;

    Car (){                        //   The Car constructor creates a new Engine object.
        engine = new Engine();     //   engine is a reference variable of type Engine. The Engine reference is stored inside the Car object.
    }
    void startCar(){
        System.out.println("Car engine is starting");
        engine.start();           //  engine.start() calls the Engine object's method.
    }
}

public class Composition2 {
    public static void main(String[] args) {

        Car c1 = new Car();       //  Creating a Car Object
        c1.startCar();
    }
}
