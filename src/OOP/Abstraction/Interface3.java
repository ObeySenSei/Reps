package OOP.Abstraction;

interface Vehicle1 {
    abstract void start();                      // start() has no body. Why? Because it's abstract.

    default void stop(){                        // stop() has a body. That's why we use default.
        System.out.println("Engine stops");
    }
    static void serviceInfo(){                  // serviceInfo() has a body too, but it's static.
        System.out.println("XYZ Motors");
    }
}
class Car2 implements Vehicle1{

    @Override
    public void start(){
        System.out.println("Engine starts");
    }
}

public class Interface3 {
    public static void main(String[] args) {
        Car2 car = new Car2();

        car.start();    // Remember this rule: Default methods belong to the implementing object's inherited behaviour. You call them using the object.
        car.stop();
        Vehicle1.serviceInfo();    // Static methods belong to the interface itself. We call them using the interface name.
    }
}
