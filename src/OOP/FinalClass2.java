package OOP;

class Student8 {
    String name;

    Student8(String name) {
        this.name = name;
    }
}

public class FinalClass2 {
    public static void main(String[] args) {

        final Student8 s1 = new Student8("Debanga");    ///  Final reference variable pointing to a mutable object

        s1.name = "Debojyoti";  // Allowed!
        System.out.println(s1.name);

        ///  s1 = new Student8 ("Rahul"); // Compilation error.   This is not allowed
    }
}
/**

 Why is this allowed ?  Because:
 final Student s1 means you cannot make s1 point to another Student object.
 But you can modify the object's non-final instance variables.

 Think of it this way:
 - s1.name = "Debashis" → Changes the name inside the existing object.
 - s1 = new Student("Rahul") → Tries to make s1 point to a different object.

 Since s1 is declared final, Java doesn't allow the second operation.

 */


