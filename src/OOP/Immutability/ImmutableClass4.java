package OOP.Immutability;  /// Defensive Copying

final class Student5 {

    private final StringBuilder name;

    Student5(StringBuilder name) {                 //  Constructor creates a separate copy.  (Constructor Defensive Copying)
        this.name = new StringBuilder(name);
    }
    public StringBuilder getName(){                // Getter returns another copy.  (Defensive Copying)
        return new StringBuilder(name);       // Every new String Builder creates a separate Object
    }
}
public class ImmutableClass4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder ("Debanga");  // We create a completely new StringBuilder object

        Student5 s1 = new Student5(sb); // Pass it to the constructor with Copy. This "Debanga" is stored in s1.

        sb.append("Hazarika");     // Modifying the original StringBuilder
        System.out.println("After modifying the original object: " + s1.getName());  // Unchanged

        s1.getName().append("Debojyoti");  // Modifying the object returned by getter
        System.out.println("\nAfter modifying getter's returned object: " + s1.getName());

    }
}

/**

 Interview Explanation – Defensive Copying

 1. StringBuilder sb = new StringBuilder("Debanga"); creates the original object.
    When passed to Student5, the constructor creates a separate copy using new StringBuilder(name), protecting the internal data.

 2. When sb.append("Hazarika") modifies the original object,
    s1.name remains unchanged because both references point to different objects.

 3. The getter also returns a new copy using new StringBuilder(name),
    so modifying the returned object with .append("Debojyoti") cannot modify the original internal data.

 */
