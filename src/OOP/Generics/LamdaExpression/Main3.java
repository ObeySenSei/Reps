package OOP.Generics.LamdaExpression;

@FunctionalInterface
interface Multiply{
    int calculate(int a, int b);

}

public class Main3 {
    public static void main(String[] args) {

        Multiply multiply = (a,b) -> a * b;            //  Parameters with a return value
        int result = multiply.calculate(10,30);
        System.out.println(result);
    }
}
