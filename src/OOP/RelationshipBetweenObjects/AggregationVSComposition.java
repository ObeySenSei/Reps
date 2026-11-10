package OOP.RelationshipBetweenObjects;

class Engine3 {
    Engine3() {
        System.out.println("Engine created");
    }
}

class Driver {      // Aggregation
    String name;
    Driver(String name) {
        this.name = name;
    }
}

class Car3 {

    Driver driver;  // Aggregation  (Passing of existing object from the outside)
    Engine engine;  // Declares a reference variable named engine of type Engine, which can hold a reference to an object of the Engine class. No object is created yet.

    Car3(Driver driver) {
        this.driver = driver;
        this.engine = new Engine();     // Creates a new Engine object in heap memory and assigns its reference to the engine variable.
                                        // The Car creates and manages its Engine — demonstrating Composition.
    }

    void display() {
        System.out.println("Driver: " + driver.name);
        System.out.println("Car has an engine.");
    }
}

public class AggregationVSComposition {
    public static void main(String[] args) {

        Driver d1 = new Driver("Rahul");
        Car3 c1 = new Car3(d1);

        c1.display();
    }
}
