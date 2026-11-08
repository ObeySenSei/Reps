package OOP.Immutability;

final class Student2{
    private final String name;    /// Instance Variables
    private final int age;

    Student2(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName (){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class ImmutableClass2 {
    public static void main(String[] args) {

        Student2 s1 = new Student2("Debanga", 26);     //  Once s1 is created, its name and age cannot be changed.

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

    }
}
/**

 Notice something:
 - We can access the variables using getters.
 - We cannot directly access the variables because they are private.
 - We cannot modify them because they are final.
 - We cannot inherit the class because it is final.
 - We haven't provided any setter methods.

 */