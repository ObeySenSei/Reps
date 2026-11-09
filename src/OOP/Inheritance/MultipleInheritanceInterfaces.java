package OOP.Inheritance;

interface Camera {
    void takePhoto();            //  This method is implicitly abstract because it has no method body.
}

interface MusicPlayer {
    public abstract void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }
}

public class MultipleInheritanceInterfaces {
    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.takePhoto();
        phone.playMusic();
    }
}

/**

 Java automatically treats it as:
 interface MusicPlayer {
 public abstract void playMusic();
 }

 When a class implements an interface, it must provide a public implementation of its abstract methods
 */
