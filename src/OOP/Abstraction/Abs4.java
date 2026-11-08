package OOP.Abstraction;
import static java.lang.Math.PI;

abstract class Shape4 {

    private String color;

    // Constructor
    Shape4(String color) {
        this.color = color;
    }

    // Abstract methods
    abstract void calculateArea();

    abstract void displayShapeName();

    // Concrete method
    public void displayColour() {
        System.out.println(color);
    }

    // Getter
    public String getColor() {
        return color;
    }
}

class Cirlce2 extends Shape4 {

    private double radius;

    Cirlce2(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println(PI * radius * radius);
    }

    @Override
    void displayShapeName() {
        System.out.println("Shape: Circle");
    }
}

class Rectangle2 extends Shape4 {

    private double length;
    private double breadth;

    Rectangle2(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea() {
        System.out.println(length * breadth);
    }

    @Override
    void displayShapeName() {
        System.out.println("Shape: Rectangle");
    }
}

public class Abs4 {

    public static void main(String[] args) {

        Shape4 c1 = new Cirlce2("Red", 5);
        Shape4 r1 = new Rectangle2("Blue", 8, 5);

        // Circle details
        c1.displayShapeName();

        System.out.print("Circle Color: ");
        c1.displayColour();

        System.out.print("Circle Area: ");
        c1.calculateArea();

        System.out.println();

        // Rectangle details
        r1.displayShapeName();

        System.out.print("Rectangle Color: ");
        r1.displayColour();

        System.out.print("Rectangle Area: ");
        r1.calculateArea();
    }
}
