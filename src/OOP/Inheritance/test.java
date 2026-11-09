package OOP.Inheritance;

interface Camera1 {
    public abstract void takePhoto();
}
interface MusicPlayer1 {
    void playMusic();
}

class Phone implements Camera1 , MusicPlayer1 {
    @Override
    public void takePhoto(){
        System.out.println("Photo is being taken !");
    }
    @Override
    public void playMusic(){
        System.out.println("Music is being played !");
    }

}
public class test {
    public static void main(String[] args) {

        Phone p1 = new Phone();

        p1.takePhoto();
        p1.playMusic();
    }
}
/**


 */
