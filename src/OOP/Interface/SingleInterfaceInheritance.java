package OOP.Interface;

interface Vehicle {
    void start();
}

interface ElectricVehicle extends Vehicle {
    public abstract void charge();
}

class Tesla implements ElectricVehicle {

    @Override
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    @Override
    public void charge() {
        System.out.println("Electric vehicle is charging...");
    }
}

public class SingleInterfaceInheritance {
    public static void main(String[] args) {

        Tesla car = new Tesla();

        car.start();
        car.charge();
    }
}