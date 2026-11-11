package OOP.Generics.ObjectCloning;

class Student3 implements Cloneable {
    String name;
    int age;
    int[] arr;

    Student3(String name, int age, int[] arr) {
        this.name = name;
        this.age = age;
        this.arr = arr;
    }

    @Override
    public Student3 clone() throws CloneNotSupportedException {

        Student3 copy = (Student3) super.clone();    // Shallow Copy

        // Creating a separate copy of the array (Deep copy) or use           copy.arr = this.arr.clone();

        copy.arr = new int[this.arr.length];          // Create a new array of the same length
        for (int i = 0; i < this.arr.length; i++) {
            copy.arr[i] = this.arr[i];
        }
        return copy;                  ///  copy.arr now points to a completely separate array.
    }
}

public class DeepCopying  {
    public static void main(String[] args) throws CloneNotSupportedException {

        int[] marks = {80, 90, 95};
        Student3 s1 = new Student3("Debanga", 21, marks);

        Student3 s2 = s1.clone();         // Creating a deep copy

        // Modifying cloned object's fields
        s2.name = "Rahul";
        s2.age = 25;
        s2.arr[0] = 100;        // Notice that modifying s2.arr[0] did not affect s1.arr[0].

        System.out.println("Original Object:");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Array: " + java.util.Arrays.toString(s1.arr));

        System.out.println("\nCloned Object:");
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
        System.out.println("Array: " + java.util.Arrays.toString(s2.arr));
    }
}
