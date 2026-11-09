package OOP.Inheritance;

interface Device {
    default void powerOn() {
        System.out.println("Device is powering on...");
    }
}
interface Camera4 extends Device {
    @Override
    default void powerOn(){
        System.out.println("Camera is starting");
    }
}
interface MusicPlayer2 extends Device{
    @Override
    default void powerOn(){
        System.out.println("Music player is starting");
    }
}
class Phone4 implements Camera4, MusicPlayer2 {
    @Override
    public void powerOn(){
        System.out.println("Phone is powering on...");
        Camera4.super.powerOn();
        MusicPlayer2.super.powerOn();
    }
}
public class Diamond3 {
    public static void main(String[] args) {
        Phone4 p1 = new Phone4();

        p1.powerOn();
    }
}
