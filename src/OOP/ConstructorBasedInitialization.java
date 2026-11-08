package OOP;

class Studentt {
    private final String name;
    private final int age;

    // Constructor-based initialization
    Studentt(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ConstructorBasedInitialization{
    public static void main(String[] args) {

        Studentt s1 = new Studentt("Debanga", 26);
    }
}
/**
 *
 new Student("Debanga", 26) creates a new object.
 The constructor receives the values and initializes the instance variables.
 Since the variables are final, their values cannot be reassigned after initialization.


 void changeName() {
 name = "Rahul";    // ERROR: Cannot reassign final variable
 }


 */