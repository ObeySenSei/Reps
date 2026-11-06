package OOP.SingletonClass;

class Singleton {

    private static Singleton instance;           /// 1. Create a static reference variable

    private Singleton() {                        /// 2. Make constructor private. Why private? Because otherwise someone could create objects directly
        System.out.println("Object created!");
    }

    public static Singleton getInstance() {      /// 3. Provide a static method to access the object

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
public class SingletonClass {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
