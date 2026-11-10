package OOP.ObjectClassMethods;
import java.util.Objects;                //   Properly overriding equals()

class Student4 {                // In our case, we're saying:  Two Student4 objects are equal if they have the same age and name.
    String name;
    int age;

    Student4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        // Checks whether both references point to the same object
        if (this == obj) {
            return true;
        }

        // Checks whether obj is null or belongs to a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Converts the Object reference into a Student4 reference
        Student4 other = (Student4) obj;

        // Compares age and name
        return age == other.age &&
                Objects.equals(name, other.name);
    }
}

public class Main2 {
    public static void main(String[] args) {

        Student4 s1 = new Student4("Rahul", 22);
        Student4 s2 = new Student4("Rahul", 22 );
        Student4 s3 = new Student4("Aman",21);

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
        System.out.println(s1.equals(s1)); // true

        System.out.println(s1.getClass());            // Displays the Class
    }
}