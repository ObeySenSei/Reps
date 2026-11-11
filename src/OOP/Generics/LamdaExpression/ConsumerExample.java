package OOP.Generics.LamdaExpression;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        ///  Consumer takes a String but returns nothing
        Consumer<String> display = name -> {
            System.out.println("Student Name: " + name);
        };

        ///  Calling accept() executes the lambda
        display.accept("Debanga");
        display.accept("Rahul");
        display.accept("Kunal");
    }
}
