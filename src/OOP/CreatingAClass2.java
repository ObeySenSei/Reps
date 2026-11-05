package OOP;

class Std{
    String name;
    int rollno;
    float marks;

    /// Constructor
    ///
    Std (String name, int rollno, float marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    public void display(){
        System.out.println("RollNo: "+ rollno + " Marks: " + marks + " Name: " + name);
    }
}
public class CreatingAClass2 {
    public static void main(String[] args) {

        Std[] student = {new Std("Debashis", 16, 89.9f),
                new Std("Debanga", 17, 94.6f),
                new Std("Debojyoti", 18, 92.4f) };

        System.out.println("All Students");

        for (Std s: student){
            s.display();
        }
        student[0].display();        ///  If you want to access data of a single element
    }
}

