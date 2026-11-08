package OOP;

public class Parameterized {
    public static void main(String[] args) {

        Student22 s1 = new Student22("Abhishek", 24);
        s1.printInfo();
    }
}

class Student22 {
    String name;
    int age;

    Student22 (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
