package OOP.ObjectClassMethods;
import java.util.HashSet;
import java.util.Objects;

class Student7 {               // Overriding both equals() and hashCode()
    String name;

    Student7(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;                       // this == obj	false, because st1 and st2 are different objects.
        if (!(obj instanceof Student7)) return false;
        Student7 other = (Student7) obj;
        return Objects.equals(name, other.name);
    }

    @Override                                           //  Since equals() returns true, HashSet recognises st2 as a duplicate.
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class Main4 {
    public static void main(String[] args) {

        HashSet<Student7> students = new HashSet<>();

        Student7 s1 = new Student7("Rahul");        // Two separate objects are created in Heap Memory, but with the same Name.
        Student7 s2 = new Student7("Rahul");

        students.add(s1);
        students.add(s2);

        System.out.println(s1.equals(s2));
        System.out.println(students.size());
    }
}
