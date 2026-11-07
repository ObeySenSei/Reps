package OOP.Encapsulation;

class Employeee{
    private String name;
    private double salary;

    public Employeee (String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void increaseSalary(double percentage){
        if (percentage > 0){
            salary = salary + (salary * percentage / 100);
        } else {
            System.out.println("Invalid Percentage");
        }
    }
}
public class test {
    public static void main(String[] args) {
        Employee e1 = new Employee("Debashis", 56000);
        System.out.println(e1.getSalary() + " is the current Salary amount");

        e1.increaseSalary(20);
        System.out.println(e1.getSalary() + " is the Salary amount after increment");
    }
}
