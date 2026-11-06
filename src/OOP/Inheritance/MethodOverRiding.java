package OOP.Inheritance;

class Vehicle {
    void start(){
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car engine is starting");
    }
    void openDoors() {    // Calling a method that only exists in Car
        System.out.println("Car doors opened");
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike engine is starting");
    }
}
public class MethodOverRiding {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        Vehicle c1 = new Car();
        Vehicle b1 = new Bike();

        v1.start();
        c1.start();
        b1.start();

        //  c1.openDoors();  compilation error
        ((Car) c1).openDoors();        /// use explicit Down-casting to access openDoors()

    }
}
/**

 This is compile-time polymorphism

 Vehicle v1 = new Vehicle();
 Car c1 = new Car();
 Bike b1 = new Bike();


 Why does this work?
 Even though all three reference variables have the type Vehicle, Java executes the overridden method belonging to the actual object.
 That's called runtime polymorphism (dynamic method dispatch).

 */
