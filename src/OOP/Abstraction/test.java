package OOP.Abstraction;

abstract class Employee2{

    private String name;
    private double baseSalary;

    Employee2(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    abstract double calculateSalary();

    public void displayName(){
        System.out.println("Name: " + name);
    }
    public double getSalary(){
        return baseSalary;
    }
}
interface Bonus2 {
    double getBonus();
}
class Manager2 extends Employee2 implements Bonus2 {
    private double bonusAmount;

    Manager2(String name, double baseSalary, double bonusAmount) {
        super(name, baseSalary);
        this.bonusAmount = bonusAmount;
    }
    public double bonuss(){
        return bonusAmount;
    }

    @Override
    public double calculateSalary(){
        return getSalary();
    }
    @Override
    public double getBonus(){
        return calculateSalary() * bonusAmount / 100;
    }
    public double calculateTotalSalary(){
        return calculateSalary() + getBonus();
    }
    public void displayDetails(){
        displayName();

        System.out.println("Base Salary: " + calculateSalary());
        System.out.println("Bonus %  : " + bonuss());
        System.out.println("Bonus Amount: " + getBonus());
        System.out.println("Total Compensation: " + calculateTotalSalary());
    }
}

public class test {
    public static void main(String[] args) {

        Manager2 m1 = new Manager2("Debojyoti Saha ", 70000,14);

        m1.displayDetails();

    }
}
