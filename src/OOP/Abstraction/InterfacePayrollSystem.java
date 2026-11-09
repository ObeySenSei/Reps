package OOP.Abstraction;

abstract class Employee1 {

    private String name;                                    // Instance Private Variables (Encapsulation)
    private double baseSalary;

    Employee1(String name, double baseSalary) {             // Constructor
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void displayName() {                             // Concrete methods
        System.out.println("Employee: " + name);
    }

    public double getBaseSalary() {                         // Getter (Concrete method) A getter is simply a method that allows us to retrieve the value of a private variable.
        return baseSalary;
    }

    public abstract double calculateSalary();               // Abstract method (will be Overridden by a Subclass)
}

interface Bonus1 {
    double calculateBonus();
}

class Manager1 extends Employee1 implements Bonus1 {

    private double bonusPercentage;

    Manager1(String name, double baseSalary, double bonusPercentage) {

        super(name, baseSalary);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public double calculateBonus() {
        return calculateSalary() * bonusPercentage / 100;
    }

    public double calculateTotalSalary() {
        return calculateSalary() + calculateBonus();
    }

    public void displaySalaryDetails() {

        displayName();

        System.out.println("Base Salary: Rs. " + calculateSalary());
        System.out.println("Bonus: Rs. " + calculateBonus());
        System.out.println("Total Salary: Rs. " + calculateTotalSalary());
    }
}

public class InterfacePayrollSystem {

    public static void main(String[] args) {

        Manager1 m1 = new Manager1("Debojyoti", 50000, 20);
        m1.displaySalaryDetails();
    }
}
