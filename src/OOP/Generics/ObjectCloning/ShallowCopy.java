package OOP.Generics.ObjectCloning;
import java.util.Arrays;

class Student2 implements Cloneable {
    String name;
    int age;
    int[] arr;

    Student2(String name, int age, int[] arr) {
        this.name = name;
        this.age = age;
        this.arr = arr;
    }

    @Override
    public Student2 clone() throws CloneNotSupportedException {
        return (Student2) super.clone();
    }
}

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {

        int[] marks = {80, 90, 95};
        Student2 s1 = new Student2("Debanga", 21, marks);

        Student2 s2 = s1.clone();      // Creating a shallow copy

        s2.name = "Rahul";             // Modifying the cloned object's fields
        s2.age = 25;
        s2.arr[0] = 100;               //  Modifying s2.arr[0] also changed the value in s1.arr[0] i.e became 100

        System.out.println("Original Object:");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Array: " + java.util.Arrays.toString(s1.arr));

        System.out.println("\nCloned Object:");
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
        System.out.println("Array: " + java.util.Arrays.toString(s2.arr));

        s2.arr[0] = 1;
        System.out.println("Modified: " + Arrays.toString(s2.arr));
    }
}
