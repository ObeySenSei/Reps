package OOP.Generics.LamdaExpression;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        ///  Supplier takes no input and returns a String
        Supplier<String> username = () -> "Debanga123";           // Here the argument remains Empty

        /// Calling get() retrieves the supplied value
        String result = username.get();
        System.out.println("Username: " + result);
    }
}