package OOP;

class Std{          /// Std is a Datatype.
    String name;    /// Instance variables. They are declared directly inside the class, outside of any constructor or method. (Class-level scope)
    int rollno;
    float marks;

    Std (String name, int rollno, float marks){      /// Constructor
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

        Std[] student = {new Std("Debashis", 16, 89.9f),    ///  student is a reference variable. The variable student holds the memory address (reference) of the array container itself.
                new Std("Debanga", 17, 94.6f),              /// Inside that array, each slot (student[0], student[1]) acts as another reference variable pointing
                new Std("Debojyoti", 18, 92.4f) };          /// to the individual Std objects (Debashis, Debanga, etc.) stored in the heap memory.


        for (Std s: student){
            s.display();
        }
        student[0].display();        ///  If you want to access data of a single element
    }
}

