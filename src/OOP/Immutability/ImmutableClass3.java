package OOP.Immutability;

final class Student3 {

    private final StringBuilder name;

    Student3(StringBuilder name) {
        this.name = name;
    }

    public StringBuilder getName() {
        return name;
    }
}
public class ImmutableClass3 {
    public class Main {
        public static void main(String[] args) {

            StringBuilder sb = new StringBuilder("Debanga");

            Student3 s1 = new Student3(sb);
            s1.getName().append(" Hazarika");

            System.out.println(s1.getName());
        }
    }
}
///   final prevents the reference from pointing to another object. It does NOT prevent modification of the object itself.