package OOP.Inheritance;

class Animal1{
    void eat(){
        System.out.println("Animals eat");
    }
}
class Dog1 extends Animal1{
    void bark(){
        System.out.println("Dogs bark");
    }
}
class Puppy extends Dog1{

    void weep(){
        System.out.println("Puppies weep");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {

        Puppy p1 = new Puppy();

        p1.weep();
        p1.bark();
        p1.eat();
    }
}
/**

 Why can p1 call all three methods?
 - weep() belongs directly to Puppy.
 - bark() belongs to Dog1, which Puppy extends.
 - eat() belongs to Animal1, which Dog1 extends.
 So Puppy gets access to the inherited methods from both levels above it.

 */