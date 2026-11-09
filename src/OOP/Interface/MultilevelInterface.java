package OOP.Interface;

interface Device {
    void connect();         // Abstract methods

    default void identify() {
        System.out.println("Generic device identified");
    }
}
interface Camera extends Device {
    @Override
    default void identify() {
        System.out.println("Camera device identified");
    }

    void takePhoto();
}

interface Alarm extends Device {
    @Override
    default void identify() {
        System.out.println("Alarm system identified");
    }

    void activateAlarm();
}

// Multiple inheritance + conflict resolution
interface SmartSystem extends Camera, Alarm {
    @Override
    default void identify() {
        System.out.println("Smart Security System identified");
        Camera.super.identify();
        Alarm.super.identify();
    }

    void monitor();
}

class SmartSecurity implements SmartSystem {

    @Override
    public void connect() {
        System.out.println("Connecting to security network...");
    }
    @Override
    public void takePhoto() {
        System.out.println("Capturing security footage...");
    }
    @Override
    public void activateAlarm() {
        System.out.println("Security alarm activated!");
    }
    @Override
    public void monitor() {
        System.out.println("Monitoring surroundings...");
    }
}

public class MultilevelInterface {
    public static void main(String[] args) {

        SmartSecurity security = new SmartSecurity();

        security.connect();
        security.identify();
        security.takePhoto();
        security.activateAlarm();
        security.monitor();
    }
}
