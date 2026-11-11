package OOP.Generics.LamdaExpression;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class CalculatorExample {
    public static void main(String[] args) {


        Calculator add = (a, b) -> a + b;            // Addition
        Calculator subtract = (a, b) -> a - b;       // Subtraction
        Calculator multiply = (a, b) -> a * b;       // Multiplication

        System.out.println("Addition: " + add.calculate(10, 5));
        System.out.println("Subtraction: " + subtract.calculate(10, 5));
        System.out.println("Multiplication: " + multiply.calculate(10, 5));
    }
}
