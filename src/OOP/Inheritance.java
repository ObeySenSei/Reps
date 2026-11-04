package OOP;

class Shape {                                        /// Parent Class
    String color;
}
class Triangle extends Shape {                      /// Single Inheritance: Triangle inherits Shape
    public void area(int base, int height) {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}
class EquilateralTriangle extends Triangle {        /// Multilevel Inheritance: EquilateralTriangle inherits Triangle
    // Method Overriding
    @Override
    public void area(int base, int height) {
        System.out.println("Equilateral Triangle Area: " + (0.5 * base * height));
    }
}
class Circle extends Shape {                      ///  Hierarchical Inheritance: Circle inherits Shape

    // Method Overloading (different parameter list)
    public void area(double radius) {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();                 /// Creating Triangle Object
        t1.area(10, 5);

        EquilateralTriangle t2 = new EquilateralTriangle();
        t2.area(10, 5);

        Circle c1 = new Circle();
        c1.area(7);
    }
}
