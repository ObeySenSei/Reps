package OOP.ObjectClassMethods;

class Student3 {
    String name;

    Student3(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {

        Student3 s1 = new Student3("Rahul");
        Student3 s2 = new Student3("Rahul");
        System.out.println(s1.equals(s2));
    }
}

