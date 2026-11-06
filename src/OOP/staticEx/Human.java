package OOP.staticEx;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;                    /// Up until here all these are instance variables.

    static long population;

    // static variables belong to the class itself, not to any individual object.
    // Every Human object shares this exact same memory location.

    public Human(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population = population + 1;  /// Increments the shared population count every time a new Human object is created

        /* Note: Use the class name 'Human.population' rather than 'this.population'.
         Although 'this.population' is syntactically allowed, using the class name makes it
         explicit that 'population' is a class-level (static) variable, not an instance variable.  */
    }
}
