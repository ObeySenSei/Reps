package OOP.Generics.LamdaExpression;

interface Greeting {
    void sayHello();    // Abstract Methods need to be Overridden.
}
public class Main {
    public static void main(String[] args) {

        Greeting obj = () -> {                        //  No parameters, no return value
            System.out.println("Hello there!");
        };
        obj.sayHello();
    }
}


/*  Instead of Writing

public class Main {
    public static void main(String[] args) {

        Greeting obj = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }
        };
        obj.sayHello();
    }
}

 */