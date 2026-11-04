package OOP;          // Demonstrating Method Overloading

public class Polymorphism {
    public static void main(String[] args) {

        Student4 s1 = new Student4();

        s1.name = "Debanga";
        s1.age = 26;

        // Calling overloaded methods
        s1.printInfo(s1.name);             ///  String parameter
        s1.printInfo(s1.age);              ///  int parameter
        s1.printInfo(s1.name, s1.age);     ///  String and int parameters
    }
}

class Student4 {
    String name;
    int age;

    // Method 1: Accepts a String
    public void printInfo(String name) {
        System.out.println(name);
    }

    // Method 2: Accepts an int
    public void printInfo(int age) {
        System.out.println(age);
    }

    // Method 3: Accepts a String and an int
    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}
