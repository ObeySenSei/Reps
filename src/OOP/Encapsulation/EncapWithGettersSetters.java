package OOP.Encapsulation;

class Studenttt {

    private String name;
    private int age;

    Studenttt(String name, int age) {     /// Constructor
        this.name = name;
        this.age = age;
    }

    public String getName() {             /// Getter for name
        return name;
    }

    public void setName(String name) {    /// Setter for name
        this.name = name;
    }

    public int getAge() {                 /// Getter for age
        return age;
    }

    public void setAge(int age) {         /// Setter for age
        if (age > 0) {
            this.age = age;
        }
    }
}

public class EncapWithGettersSetters {
    public static void main(String[] args) {

        Studenttt s1 = new Studenttt("Debanga", 22);

        // Accessing private variables through getters
        System.out.println("Original Name: " + s1.getName());
        System.out.println("Original Age: " + s1.getAge());

        // Modifying private variables through setters
        s1.setName("Rahul");
        s1.setAge(23);

        System.out.println("\nUpdated Name: " + s1.getName());
        System.out.println("Updated Age: " + s1.getAge());
    }
}
