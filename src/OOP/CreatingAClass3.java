package OOP;

class Employee{
    String name;
    int id;
    double salary;

    Employee (String name, int id, double salary){
        this.name = name;                               /// this.name refers to the reference variable of that current Object.
        this.id = id;
        this.salary = salary;
    }
    Employee (String name, int id){
        this.name = name;
        this.id = id;
        this.salary = 25000;

    }
    Employee (){
        this.name = "Debojyoti";
        this.id = 0;
        this.salary = 0.0;
    }
    public void display (){                  // display() is an instance method belonging to the Employee class.
        System.out.println("Name: " + name + " ID: " + id + " Salary: " + salary);
    }
}
public class CreatingAClass3 {
    public static void main(String[] args) {

        Employee e1 = new Employee ("Debashis", 0001, 65000.00);
        Employee e2 = new Employee ("Debanga", 0002);
        Employee e3 = new Employee ();

        Employee[] employees = {e1,e2,e3};

        for (Employee s : employees){
            s.display();                        ///   Call the display() method of the Employee object that s currently refers to.
        }
        employees[1].display();
    }
}
