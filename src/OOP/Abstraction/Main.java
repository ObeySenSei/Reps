package OOP.Abstraction;

abstract class Vehicle {

    String brand;
    String model;

    // Parent class constructor
    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Common method for all vehicles
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    // Abstract method
    abstract void start();
}

// Child class 1
class Car extends Vehicle {

    Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    void start() {
        System.out.println("Car starts with a push button.");
    }
}

// Child class 2
class Bike extends Vehicle {

    Bike(String brand, String model) {
        super(brand, model);
    }

    @Override
    void start() {
        System.out.println("Bike starts with a self-start or kick.");
    }
}

// Child class 3
class Truck extends Vehicle {

    Truck(String brand, String model) {
        super(brand, model);
    }

    @Override
    void start() {
        System.out.println("Truck starts using a heavy-duty ignition system.");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Toyota", "Fortuner");
        Vehicle bike = new Bike("Honda", "CB350");
        Vehicle truck = new Truck("Volvo", "FH16");

        car.displayDetails();
        car.start();

        System.out.println("----------------");

        bike.displayDetails();
        bike.start();

        System.out.println("----------------");

        truck.displayDetails();
        truck.start();
    }
}