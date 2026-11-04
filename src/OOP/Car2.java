package OOP;

public class Car2 {

    String name = "Ford";
    String model = "Mustang";
    int year = 2024;
    double price = 58000.99;
    boolean isRunning = true;

    void start(){
        isRunning = true;
        System.out.println("You start the Engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the Engine");
    }
    void drive(){
        System.out.println("You drive the " + model);
    }

    public static void main(String[] args) {

        Car2 car = new Car2();

        System.out.println(car.isRunning);     /// Should give true here in the initial declaration

        car.start();
        System.out.println(car.isRunning);

        car.stop();
        System.out.println(car.isRunning);

        car.drive();
    }
}

