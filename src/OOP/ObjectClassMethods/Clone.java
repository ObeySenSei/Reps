package OOP.ObjectClassMethods;

class Student1 implements Cloneable {
    String name;
    Student1(String name) {
        this.name = name;
    }

    @Override
    public Student1 clone() throws CloneNotSupportedException {
        return (Student1) super.clone();
    }
}

public class Clone {
    public static void main(String[] args) {

        try {
            Student1 s1 = new Student1("Debanga");

            Student1 s2 = s1.clone();          // Creating a copy of s1

            System.out.println("Original Object: " + s1.name);
            System.out.println("Cloned Object: " + s2.name);


            System.out.println(s1 == s2);      // Checking references

            s2.name = "Rahul";                 // Changing cloned object's name

            System.out.println("After modification:");
            System.out.println("Original: " + s1.name);
            System.out.println("Cloned: " + s2.name);

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}