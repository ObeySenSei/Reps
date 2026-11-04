package OOP;
import java.util.Random;
import java.util.Scanner;

///  Object = An entity that holds data (attributes) and can perform actions (methods). It is a reference data type.

public class Car {

    String name = "Ford";
    String model = "Mustang";
    int year = 2024;
    double price = 58000.99;
    boolean isRunning = true;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);          /// Built-in java object
        Random random = new Random();

        Car car = new Car();
        System.out.println(car.name);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
    }
}
