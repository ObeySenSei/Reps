package OOP.RelationshipBetweenObjects;

class Professor{
    String name;
    Professor(String name){
        this.name = name;
    }
}
class Department{
    String dept;
    Professor professor;

    Department(String dept, Professor professor){
        this.dept = dept;
        this.professor = professor;
    }
    void display(){
        System.out.println("Department Branch : " + dept);
        System.out.println("Professor Name: " + professor.name);

        // Because professor is an object reference of the Professor class, and name is a variable inside that class.
    }

}
public class Aggregation {
    public static void main(String[] args) {
        Professor p1 = new Professor("Mr Abhishek Kalita");
        Department d1 = new Department(" Computer Science", p1);

        d1.display();
    }
}
