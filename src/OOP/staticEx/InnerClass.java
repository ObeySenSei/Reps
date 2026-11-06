package OOP.staticEx;

public class InnerClass {

    static class Test {

        String name;
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
/**

 public class InnerClasses {

 class Test {           // Non-static Inner Class
 String name;

 public Test(String name) {
 this.name = name;
 }

 public static void main(String[] args) {

       InnerClass outer = new InnerClass();

       InnerClass.Test a = outer.new Test("Kunal");        // Step 2: Create objects of the Inner Class
       InnerClass.Test b = outer.new Test("Rahul");

       System.out.println(a.name);
       System.out.println(b.name);

 */