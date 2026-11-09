package OOP.Inheritance;

interface VoiceAssistant {
    default void start(){
        System.out.println("Your Voice Assistant is about to start.");
    }
    default  void status(){
        System.out.println("Voice Assistant has been activated.");
    }
}
interface AlarmSystem {
    default void start(){
        System.out.println("Your Alarm System is about to start.");
    }
    default void status(){
        System.out.println("Alarm System has been activated.");
    }
}
class Monitor implements VoiceAssistant, AlarmSystem {

    @Override
    public void start(){
        System.out.println("Starting Monitoring Systems.");
        VoiceAssistant.super.start();
        AlarmSystem.super.start();
    }

    @Override
    public void status(){
        System.out.println("\nAll Monitoring systems have been activated.");
        VoiceAssistant.super.status();
        AlarmSystem.super.status();
    }
}
public class DiamondProblem2 {
    public static void main(String[] args) {

        Monitor m1 = new Monitor();

        m1.start();
        m1.status();
    }
}
