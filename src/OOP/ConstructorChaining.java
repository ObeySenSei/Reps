package OOP;

class Student7 {
    String name;
    int rollno;
    float marks;

    Student7() {
        this("Unknown", 0, 0.0f);               /// In constructor chaining we use this()
    }
    Student7(String name, int rollno) {
        this(name, rollno, 50.0f);
    }
    Student7(String name, int rollno, float marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    void display() {
        System.out.println(name + " " + rollno + " " + marks);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {

        Student7 s1 = new Student7();
        Student7 s2 = new Student7("Debanga", 17);

        s1.display();
        s2.display();
    }
}

