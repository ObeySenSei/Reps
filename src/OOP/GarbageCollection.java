package OOP;

class Stdnt1 {
    String name;

    Stdnt1(String name) {
        this.name = name;
    }
}
public class GarbageCollection {

    public static void main(String[] args) {

        Stdnt1 s1 = new Stdnt1("Debanga");
        s1 = null;

        System.gc();        /// System.gc() is only a request to the JVM. It does not guarantee that garbage collection will happen immediately.
    }
}

