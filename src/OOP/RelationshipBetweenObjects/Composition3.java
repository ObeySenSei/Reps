package OOP.RelationshipBetweenObjects;

class Motherboard{
    void boot (){
        System.out.println("Motherboard is booting.");
    }

}
class Computer{
    private Motherboard mb;   // Here we have created a motherboard reference 'mb' variable that holds a Motherboard Object

    Computer(){                   // Computer constructor runs when a Computer obj is created and runs the code inside
        mb = new Motherboard();   // A new Motherboard object is created and is assigned to the reference 'mb'.
    }
    void start(){
        System.out.println("Computer is starting");
        mb.boot();
    }
}
public class Composition3 {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.start();

    }
}
/* mb.boot()   -   is able to use the boot method in a different Class because
   it uses that same object to execute the boot() method defined inside Motherboard.

   'mb' is a reference variable pointing to an object of type Motherboard.

   private Motherboard mb;
   We use private to prevent other classes from directly accessing or modifying the motherboard reference.

*/
