package OOP.Abstraction;
import static java.lang.Math.PI;

abstract class Shape {
    private String color;    // private variable color

    Shape(String color){     // constructor to initialize color.
        this.color = color;
    }
    abstract double calculateArea();   // Abstract method

    public void displayColour(){     // Concrete Method to display color
        System.out.println(color);
    }
    public String getColor(){
        return color;
    }
}
class Circle extends Shape {

    private double  radius;
    Circle(String color, double radius){
        super(color);
        this.radius = radius;               // Notice the change from the previous question
    }
    @Override
    double calculateArea (){
        return PI * radius * radius;
    }
}
class Rectangle extends Shape {

    private double  length;
    private double  breadth;

    Rectangle(String color, double length, double breadth){
        super(color);
        this.breadth = breadth;
        this.length = length;
    }
    @Override
    double calculateArea(){                  // Return type method. Not void
        return length * breadth;
    }
}

public class Abs3 {
    public static void main(String[] args) {
        Shape c1 = new Circle("Red", 5);
        Shape r1 = new Rectangle("Blue",8,4);

        System.out.print("Circle Color: ");
        c1.displayColour();
        System.out.println("Circle Area: " + c1.calculateArea());

        System.out.print("Rectangle Color: ");
        r1.displayColour();
        System.out.println("Rectangle Area: " + r1.calculateArea());
    }
}


