package OOP.ShallowCopyVSDeepCopy;

class Address2 {

    String city;
    Address2(String city) {
        this.city = city;
    }
}

class Student3 implements Cloneable {

    String name;
    Address2 address;

    Student3(String name, Address2 address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy
    @Override
    public Student3 clone() throws CloneNotSupportedException {

        Student3 copied = (Student3) super.clone();

        // Creating a completely new Address object
        copied.address = new Address2(this.address.city);

        return copied;
    }
}

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {

        Address2 a1 = new Address2("Tezpur");
        Student3 s1 = new Student3("Debanga", a1);

        Student3 s2 = s1.clone();         // Creating deep copy

        s2.address.city = "Guwahati";     // Modifying copied student's address

        System.out.println("Original Student: " + s1.name);
        System.out.println("Original City: " + s1.address.city);

        System.out.println("Copied Student: " + s2.name);
        System.out.println("Copied City: " + s2.address.city);
    }
}
