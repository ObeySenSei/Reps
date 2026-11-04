package OOP;

public class CopyConstructor {
    public static void main(String[] args) {

        Studnt s1 = new Studnt();               /// 1. Using the no-arg constructor to create s1
        s1.name = "Abhishek";
        s1.age = 24;

        Studnt s2 = new Studnt(s1);        /// 2. Using the copy constructor to create s2 from s1
        s2.printInfo();                       /// Printing info for s2 to verify the copy constructor works
    }
}

class Studnt {
    String name;
    int age;

    Studnt() {                             /// Default (no-arg) constructor
    }

    Studnt(Studnt s2) {                   /// Corrected copy constructor taking Student3 instead of Student
        this.name = s2.name;
        this.age = s2.age;
    }
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}