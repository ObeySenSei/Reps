package OOP.Inheritance;

class Shape {
    void display(){
        System.out.println("This is a shape.");
    }
}
class Circle extends Shape{

    @Override
    void display(){
        super.display();       ///  Calls Shape's display() method

        System.out.println("This is a circle.");
    }
}
public class UsingSuperToAccessParentMethods {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.display();

    }
}
/**

 One important distinction: super.display() doesn't create another object or switch objects.
 It simply calls the parent's version of the method on the same object.

 */