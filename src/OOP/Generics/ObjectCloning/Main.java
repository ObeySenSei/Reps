package OOP.Generics.ObjectCloning;

class Student implements Cloneable {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student(21, "Debanga");

        Student s2 = (Student) s1.clone();    // Creating a clone of s1

        System.out.println(s1.age + " " + s1.name);
        System.out.println(s2.age + " " + s2.name);
    }
}