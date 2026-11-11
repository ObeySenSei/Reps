package OOP.Enumeration;

enum TrafficLight {
    RED,
    YELLOW,
    GREEN
}

public class Main4 {
    public static void main(String[] args) {

        TrafficLight signal = TrafficLight.RED;

        switch (signal) {

            case RED:
                System.out.println("Stop!");
                break;

            case YELLOW:
                System.out.println("Get Ready!");
                break;

            case GREEN:
                System.out.println("Go!");
                break;
        }
    }
}