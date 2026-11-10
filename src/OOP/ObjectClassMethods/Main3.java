package OOP.ObjectClassMethods;
import java.util.HashSet;
import java.util.Objects;         //   What happens if we override equals() but not hashCode()?

class Student5 {
    String name;

    Student5(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;                     // this == obj	false, because s1 and s2 are different objects.
        if (!(obj instanceof Student5)) return false;     // true, because obj refers to a Student object.
        Student5 other = (Student5) obj;                  // Converts obj into a Student reference.
        return Objects.equals(name, other.name);    // Compares "Debanga" with "Debanga".
    }
}

public class Main3 {
    public static void main(String[] args) {

        HashSet<Student5> students = new HashSet<>();

        Student5 s1 = new Student5("Rahul");
        Student5 s2 = new Student5("Rahul");

        students.add(s1);
        students.add(s2);

        System.out.println(s1.equals(s2));
        System.out.println(students.size());
    }
}