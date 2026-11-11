package OOP.Generics.CompareObjects;
import java.util.Arrays;

class Student1 implements Comparable<Student1> {
    int age;
    Student1(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student1 other) {
        return Integer.compare(this.age, other.age);     //  This is a built-in Java method used to compare two integer values.
    }

    @Override
    public String toString() {
        return "Age: " + age;
    }
}

public class Main2 {
    public static void main(String[] args) {

        Student1[] std = {new Student1(25), new Student1(19), new Student1(28)};

        Arrays.sort(std);
        System.out.println(Arrays.toString(std));
    }
}
