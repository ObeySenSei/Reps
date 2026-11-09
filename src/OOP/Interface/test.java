package OOP.Interface;

interface Device1{
    void connect();
    default void identify(){
        System.out.println("Generic device identified");
    }
}
interface Alarm1 extends Device1{
    @Override
    default void identify(){
        System.out.println("Alarm System identified");
    }
    void activateAlarm();
}
interface Camera1 extends  Device1 {
    @Override
    default void identify() {
        System.out.println("Camera systems identified");
    }
    void takePhoto();
}

interface SmartSys extends Alarm1, Camera1 {
    @Override
    default void identify() {
        System.out.println("Smart systems identified");

        Alarm1.super.identify();
        Camera1.super.identify();
    }

    void monitor();
    }
class SmartSecurity1 implements SmartSys {
    @Override
    public void connect(){
        System.out.println("Connecting to security Network");
    }
    @Override
    public void activateAlarm(){
        System.out.println("Activating the alarm");
    }
    @Override
    public void takePhoto(){
        System.out.println("Taking a Photo");
    }
    @Override
    public void monitor(){
        System.out.println("Monitoring active");
    }
}
public class test{
    public static void main(String[] args) {
        SmartSecurity1 s1 = new SmartSecurity1();

        s1.connect();
        s1.activateAlarm();
        s1.takePhoto();
        s1.monitor();
        s1.identify();

    }
}







