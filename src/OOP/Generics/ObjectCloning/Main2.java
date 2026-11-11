package OOP.Generics.ObjectCloning;

class Employee implements Cloneable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1 = new Employee(101, "Debanga", 50000);

        Employee e2 = e1.clone();         // Clone the original employee

        e2.name = "Rahul";                // Modify the cloned object
        e2.salary = 65000;

        System.out.println("Original Employee: " + e1);
        System.out.println("Cloned Employee: " + e2);
    }
}