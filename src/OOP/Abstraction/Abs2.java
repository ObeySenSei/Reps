package OOP.Abstraction;    /// Using an Abstract Class alongside private variables  (ABSTRACTION + Encapsulation)

abstract class Vehiclee {

    private int speed;
    Vehiclee(int speed) {       /// Constructor
        setSpeed(speed);
    }

    abstract void start();     /// Abstract method

    public void setSpeed(int speed) {        /// Setter with validation

        if (speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed!");
        }
    }

    public int getSpeed() {       /// Getter. Our getter doesn't need any external information. It simply retrieves the existing value of speed.
        return speed;
    }
}

class Car1 extends Vehiclee {

    Car1(int speed) {          ///  Constructor chaining. The Car constructor calls the Vehicle constructor. Same applies to the Bike
        super(speed);
    }

    @Override
    void start() {
        System.out.println("Car engine started!");
    }
}

class Bike1 extends Vehiclee {

    Bike1(int speed) {
        super(speed);
    }

    @Override
    void start() {
        System.out.println("Bike engine started!");
    }
}

public class Abs2 {

    public static void main(String[] args) {

        Vehiclee v1 = new Car1(120);
        Vehiclee v2 = new Bike1(80);

        v1.start();
        v2.start();

        System.out.println("Car Speed: " + v1.getSpeed());
        System.out.println("Bike Speed: " + v2.getSpeed());

        v1.setSpeed(-10);

    }
}

/*
  Abstraction defines the behaviour expected from a vehicle.
  Encapsulation protects the vehicle's internal data.

 */