package OOP.Generics.LamdaExpression;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        /// Takes a String and returns another String
        Function<String, String> convert = name -> {
            return name.toUpperCase();
        };

        /// Calling apply() executes the lambda
        String result = convert.apply("debanga");

        System.out.println("Uppercase: " + result);
    }
}
