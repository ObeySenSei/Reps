package OOP.Abstraction;

abstract class Vehicleee{

    private int speed;
    Vehicleee(int speed){
        setSpeed(speed);
    }
    abstract void start();  // abstract method

    public void setSpeed(int speed){
        if (speed > 0){
            this.speed = speed;
        } else {
            System.out.println("Invalid Speed");
        }
    }
    public int getSpeed (){
        return speed;
    }
}
class Car2 extends Vehicleee {

    Car2(int speed){
        super(speed);
    }

    @Override
    public void start(){
        System.out.println("Car engine started.");
    }
}
class Bike2 extends Vehicleee{

    Bike2(int speed){
        super(speed);
    }
    @Override
    public void start(){
        System.out.println("Bike engine started");
    }
}
public class test {
    public static void main(String[] args) {
        Vehicleee v1 = new Car2(100);
        Vehicleee v2 = new Bike2(60);

        v1.start();
        v2.start();

        System.out.println(v1.getSpeed());
        System.out.println(v2.getSpeed());

        v1.setSpeed(-40);
    }
}