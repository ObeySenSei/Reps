package OOP.Enumeration;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Main5 {
    public static void main(String[] args) {

        Level l = Level.MEDIUM;

        System.out.println(l.name());
        System.out.println(l.ordinal());

        System.out.println(Level.valueOf("HIGH"));

        for (Level x : Level.values()) {
            System.out.println(x);
        }
    }
}