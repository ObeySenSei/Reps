package OOP.Generics.CompareObjects;
import java.util.Arrays;

class Employee implements Comparable<Employee>{
    String name;
    int salary;

    Employee(String name, int salary){
        this.salary = salary;
        this.name = name;
    }
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.salary , other.salary);    // Notice here we are just passing down two parameters instead of (this.age - other.age)
    }
    @Override
    public String toString(){
        return name + " : Rs " + salary;
    }
}
public class Main3 {
    public static void main(String[] args) {

        Employee[] employees = {new Employee("Rahul", 45000), new Employee("Aman ", 65000),
                new Employee("Kunal", 35000), new Employee("Debanga", 80000)};

        Arrays.sort(employees);

        for (Employee e : employees){
            System.out.println(e);
        }
    }
}

