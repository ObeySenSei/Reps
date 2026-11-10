package OOP.ObjectClassMethods;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ToString {
    public static void main(String[] args) {

        Student s1 = new Student("Debanga", 26);
        System.out.println(s1);
    }
}