package OOP;

public class PenEx {
    public static void main(String[] args) {
        Pen pen1 = new Pen();                  /// Object name should be similar to the class name
        pen1.colour = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen ();
        pen2.colour = "Black";
        pen2.type = "Ball";

        pen1.printColour();                 ///  Will be printed 1st
        pen2.printColour();                 ///  Will be printed 2nd
    }
}
class Pen {
    String colour;
    String type;

    public void printColour(){                   /// The functions that are defined inside the Class are known as Methods.
        System.out.println(this.colour);
    }
}
