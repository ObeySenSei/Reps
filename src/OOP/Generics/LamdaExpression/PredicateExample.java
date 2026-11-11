package OOP.Generics.LamdaExpression;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        ///  Predicate takes an Integer and returns boolean
        Predicate<Integer> isEven = num -> num % 2 == 0;

        /// Calling test() executes the lambda
        System.out.println("10 is even: " + isEven.test(10));
        System.out.println("7 is even: " + isEven.test(7));
    }
}
