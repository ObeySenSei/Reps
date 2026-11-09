package OOP.Interface;

interface Config {
    StringBuilder MESSAGE = new StringBuilder("Hello");  // All variables declared inside a Java interface are implicitly public static final
}

public class Tricky {
    public static void main(String[] args) {

        Config.MESSAGE.append(" Java");
        System.out.println(Config.MESSAGE);

        // Config.MESSAGE = new StringBuilder("Hi");
        // Compilation error!
    }
}
/*

Why is this allowed?
Because final prevents reassignment of the reference, not modification of the object it points to.

 */