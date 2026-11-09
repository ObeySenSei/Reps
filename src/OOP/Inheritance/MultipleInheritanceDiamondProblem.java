package OOP.Inheritance;

interface Father{
    default void show(){
        System.out.println("Father's show method");
    }
}
interface Mother{
    default void show(){
        System.out.println("Mother's show method");
    }
}
class Childd implements  Father, Mother {
    @Override
    public void show() {

        System.out.println("Child resolves the conflict");
        Father.super.show();
        Mother.super.show();
    }
}
public class MultipleInheritanceDiamondProblem {
    public static void main(String[] args) {

        Childd c = new Childd();
        c.show();

    }
}
