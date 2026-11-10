package OOP.RelationshipBetweenObjects;

class Student {
    String name;

    Student(String name){
        this.name = name;
    }
}
class Teacher {
    String name;

    Teacher(String name){
        this.name = name;
    }
    void display(Student std){
        System.out.println(name + " is teaching " + std.name);   // Accessing the std  object from the Student Class
    }
}

public class Association {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mr Abishek Kalita");
        Student s1 = new Student("Debashis");

        t1.display(s1);          // Pass the std reference
    }
}

//  Association is the relationship between two independent classes where objects interact with or use each other
