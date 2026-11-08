package OOP.ShallowCopyVSDeepCopy;

class Address {
    String city;
    Address(String city) {
        this.city = city;
    }
}

class Student2 implements Cloneable {

    String name;
    Address address;

    Student2(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy
    @Override
    public Student2 clone() throws CloneNotSupportedException {
        return (Student2) super.clone();
    }
}

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {

        Address a1 = new Address("Tezpur");

        Student2 s1 = new Student2("Debanga", a1);

        Student2 s2 = s1.clone();             // Creating shallow copy

        s2.address.city = "Guwahati";         // Modifying nested Address object through s2

        System.out.println("Original Student: " + s1.name);
        System.out.println("Original City: " + s1.address.city);

        System.out.println("Copied Student: " + s2.name);
        System.out.println("Copied City: " + s2.address.city);
    }
}
