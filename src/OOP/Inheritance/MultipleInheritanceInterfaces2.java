package OOP.Inheritance;

interface Programmer {
    public abstract void writeCode ();
}
interface Designer {
    void designUI();
}

class Employee3 implements Programmer,Designer {
    @Override
    public void writeCode(){
        System.out.println("Employee is writing Java code.");
    }
    @Override
    public void designUI(){
        System.out.println("Employee is designing UI");
    }
}

public class MultipleInheritanceInterfaces2 {
    public static void main(String[] args) {

        // Notice the difference here

        Employee3 e1 = new Employee3();

        Programmer p1 = e1;            // Upcasting         -       Both references p1 and d1, point to the same Employee object.
        Designer d1 = e1;              // Upcasting

        p1.writeCode();
        d1.designUI();
    }
}
