package OOP.Abstraction;   ///    Abstract Class + Interface

abstract class Employee {
    private String name;                // Private variable

    Employee(String name){              // Constructor
        this.name = name;
    }
    public void displayName(){          // Concrete Method
        System.out.println(name);
    }
    abstract void calculateSalary();    // Abstract Method
}
interface Bonus {
    abstract void calculateBonus();
}
class Manager extends Employee implements Bonus {      ///  A  class Manager that extends Employee and implements Bonus.

    Manager(String name){                // Bringing info from the parent constructor  (Constructor Chaining)
        super(name);
    }
    @Override
    public void calculateSalary(){
        System.out.println("Rs 50000");
    }
    @Override
    public void calculateBonus(){
        System.out.println("Rs 10000");
    }
}

public class Interface5 {
    public static void main(String[] args) {

        Manager m1 = new Manager("Deboyoti Saha");

        //  Employee e1 = new Manager("Debojyoti");
        //  Error.  Remember our earlier rule: The reference type determines which methods you can access.
        //  Employee doesn't know anything about calculateBonus() because that method belongs to the Bonus interface.

        m1.displayName();
        m1.calculateSalary();
        m1.calculateBonus();

        Bonus b1 = new Manager("Debojyoti");
        b1.calculateBonus();
        // b1.calculateSalary();    //  Error because  calculateSalary() is not recognized by the interface Bonus

    }
}
