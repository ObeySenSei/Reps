package OOP.Inheritance;

class Box {
    double l;
    double h;               /// Instance variables
    double w;

    Box() {               /// Constructor with no Arguments
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side) {    /// Constructor with 1 Argument(s)
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {      /// Constructor with 3 Argument(s)
        this.l = l;
        this.h = h;
        this.w = w;
    }

    void information() {
        System.out.println("Running the Box");
    }
}
class BoxWeight extends Box {

    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(double l, double h, double w, double weight) {

        super(l, h, w);          /// Invokes parent constructor with the 3 arguments. (Call the Parent class constructor)
        this.weight = weight;
    }
}
public class BoxExample {
    public static void main(String[] args) {

        BoxWeight box = new BoxWeight(10, 20, 30, 40);

        System.out.println(box.l);
        System.out.println(box.h);
        System.out.println(box.w);
        System.out.println(box.weight);
    }
}

/**

 Suppose we modify the parent class:
 class Box {

 private double l;
 private double h;
 private double w;
 }

 class BoxWeight extends Box {

 void show() {
 System.out.println(l);
 }

 This produces a compilation error.

 Why?
 Because private members are accessible only within the class in which they are declared.
 Even a child class cannot directly access its parent's private members.

 However, there's an important distinction:
 Private members still exist as part of the object. They are simply inaccessible directly from the subclass.


 How do we access them?
 Through public or protected methods.
 class Box {
 private double l = 10;

 public double getLength() {
 return l;
 }

 class BoxWeight extends Box {
 void show() {
 System.out.println(getLength());
 }

 */