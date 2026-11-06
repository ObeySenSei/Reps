package OOP.staticEx;

class Calculator {

    static int add(int a, int b) {
        return a + b;
    }
}
public class StaticMethods {
    public static void main(String[] args) {
        System.out.println(Calculator.add(10, 20));
    }
}

/**  We can call it without creating an object unlike static variables
A static method belongs to the class rather than an individual object. */