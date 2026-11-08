package OOP.Immutability;

class Student{
    String name;

    Student(String name){    // Constructor
        this.name = name;
    }
}
public class ImmutableClasses {
    public static void main(String[] args) {

        Student s1 = new Student("Debanga");

        s1.name = "Debojyoti";
        System.out.println(s1.name);       // The original name would be modified
    }
}
