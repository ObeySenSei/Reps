package OOP;                /// Demonstrating Method Overriding

public class Overriding {
    public static void main(String[] args) {

        Stdnt s1 = new Stdnt();
        s1.name = "Debanga";
        s1.age = 26;

        s1.printInfo();

        // Runtime Polymorphism
        Stdnt s2 = new CollegeStudent();
        s2.name = "Debanga";
        s2.age = 26;

        s2.printInfo();
    }
}

class Stdnt {
    String name;
    int age;

    // Method to be overridden
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class CollegeStudent extends Stdnt {

    // Overriding the parent class method
    @Override
    public void printInfo() {
        System.out.println("College Student: " + name);
        System.out.println("Age: " + age);
    }
}

