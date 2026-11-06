package OOP.Inheritance;

class Person{
    String name;    /// Instance Variables
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo){
        super(name,age);         ///  Calls Person's constructor
        this.rollNo = rollNo;
    }
    void display(){
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("RollNo: " + rollNo);
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {

        Student s1 = new Student("Debanga" , 26, 18);
        s1.display();
    }
}
/**

 Constructor → initializes variables.
 super() → invokes parent constructor.
 display() → prints the values.
 main() → creates the object and calls methods.

 */
