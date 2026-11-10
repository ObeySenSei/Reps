package OOP.RelationshipBetweenObjects;

class Doctor {
    String name;
    Doctor(String name){
        this.name = name;
    }
    void treatPatient(Human hm){
        System.out.println(name + " is treating Mr. " + hm.name);
    }
}

class Human {
    String name;

    Human (String name){
        this.name = name;
    }
    void visitDoctor(Doctor doc){
        System.out.println(name + " is visiting Dr." + doc.name);    // Notice how we are use the doc object from Doctor class

        doc.treatPatient(this);   // Here, this refers to the current Human object (hm). So the Doctor receives the Human object and accesses its name.
    }
}
public class Association2 {
    public static void main(String[] args) {

        Doctor doc = new Doctor(" Abhishek");
        Human hm = new Human("Debojyoti");

        hm.visitDoctor(doc);        //   We pass the Doctor object into the Human class's method.

    }
}
