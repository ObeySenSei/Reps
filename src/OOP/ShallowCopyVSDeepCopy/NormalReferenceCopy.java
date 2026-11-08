package OOP.ShallowCopyVSDeepCopy;

class Sstudent{
    String name;

    Sstudent(String name){
        this.name = name;
    }
}
public class NormalReferenceCopy {
    public static void main(String[] args) {
        Sstudent s1 = new Sstudent("Debanga");

        Sstudent s2 = s1;            //  Copying the reference, NOT the object

        s2.name = "Debashis";
        System.out.println(s2.name);
    }
}
