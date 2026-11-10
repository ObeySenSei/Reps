package OOP.ObjectClassMethods;

class Studentt {
}

public class GetClass {
    public static void main(String[] args) {

        Studentt s1 = new Studentt();

        System.out.println(s1.getClass());            //  getClass() returns a Class object representing the runtime type.
        System.out.println(s1.getClass().getName());  //  getClass().getName() returns its fully qualified class name.
    }
}