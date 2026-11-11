package OOP.Generics.LamdaExpression;

@FunctionalInterface
interface Addition {
    void add(int a, int b);            // No return (void).
}

public class Main2 {
    public static void main(String[] args) {

        Addition obj = (a, b) -> System.out.println(a + b);      //  Parameters with no return value
        obj.add(10, 20);
    }
}
