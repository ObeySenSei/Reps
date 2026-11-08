package OOP.AccessModifiers;

class Student {

    private String name;         //   Name cannot be accessed directly outside the Student class.
    public int age;              //   Age can directly be accessed

    public void setName(String name) {     //  setName() is public, so we can access it from Main.
        this.name = name;
    }

    public void display() {          //
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        // s1.name = "Rahul"; // ERROR: private

        s1.setName("Rahul"); // Allowed
        s1.age = 22;         // Allowed          Notice how we can directly access and modify age from Main.

        s1.display();
    }
}