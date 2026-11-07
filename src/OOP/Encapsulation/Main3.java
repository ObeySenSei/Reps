package OOP.Encapsulation;

class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {

        if (percentage > 0) {
            salary += salary * percentage / 100;
        } else {
            System.out.println("Invalid percentage");
        }
    }
}

public class Main3 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", 30000);
        System.out.println(e1.getSalary());

        e1.increaseSalary(10);
        System.out.println(e1.getSalary());
    }
}

///     Create an employee class where salary can be viewed but cannot be directly modified.
///     Salary increases must happen through a dedicated method.