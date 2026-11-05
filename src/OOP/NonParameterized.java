package OOP;   // Non- parameterized Constructor.

class Student {                        /// This is our Student Class
String name;
    int age;

    public void printInfo (){                  /// Both the print statements will be executed.
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("Here we have called a constructor named Student inside the Class: Student");
    }
}

public class NonParameterized{
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Abhishek";
        s1.age = 24;
        s1.printInfo();
    }
}



