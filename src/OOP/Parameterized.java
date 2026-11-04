package OOP;

public class Parameterized {
    public static void main(String[] args) {

        Student2 s1 = new Student2 ("Abhishek", 24);
        s1.printInfo();
    }
}

class Student2 {
    String name;
    int age;

    Student2 (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
