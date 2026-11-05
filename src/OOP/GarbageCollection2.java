package OOP;

class Student9 {
    String name;                      /// Instance variable
    Student9(String name) {          /// Constructor with argument
        this.name = name;
    }

    @Override               /// Called by the garbage collector before reclaiming the object
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}

public class GarbageCollection2 {
    public static void main(String[] args) {

        Student9 s1 = new Student9("Debanga");

        s1 = null;      // Object becomes eligible for GC
        System.gc();   // Request garbage collection
    }
}
/**

 finalize() was historically called by the garbage collector before reclaiming an object.
  s1 = null makes the object eligible for garbage collection if no other references exist.
 System.gc() requests garbage collection but does not guarantee it.
 The output is therefore not guaranteed.

 finalize() is deprecated since Java 9 and was deprecated for removal because
 it is unpredictable and can cause performance and security problems.
 Modern Java code should not rely on it for cleanup.

 */