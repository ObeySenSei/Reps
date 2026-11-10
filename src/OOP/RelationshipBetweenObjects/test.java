package OOP.RelationshipBetweenObjects;

class Doctor3 {
    String name;
    String specialization;

    Doctor3(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }
    void treatPatient(Patient3 patient){
        System.out.println("Dr. " + name + " is current treating " + patient.name + "\n");
    }
}

class Patient3 {
    String name;
    int age;
    Patient3(String name, int age){
        this.name = name;
        this.age = age;
    }
    void bookAppointment(Doctor3 doc, Appointment3 app){
        System.out.println("Appointment Details ");
        System.out.println("Patient name: " + name);
        System.out.println("Doctor: " + doc.name + " Specialization: " + doc.specialization);
        System.out.println("Appointment ID: " + app.id);

        doc.treatPatient(this);
    }
}

class Appointment3{
    int id;
    String date;
    String time;

    Appointment3(int id, String date, String time){
        this.id = id;
        this.date = date;
        this.time = time;
    }
    void displayAppointment(){
        System.out.println("Date: " + date);
        System.out.println("Date: " + time);
    }

}
public class test{
    public static void main(String[] args) {

        Doctor3 d1 = new Doctor3("Abhishek", "Cardiology");
        Patient3 p1 = new Patient3("Debashis", 26);
        Appointment3 a1 = new Appointment3(101,"11-11-2026", "1:15 AM");

        p1.bookAppointment(d1,a1);
        a1.displayAppointment();


    }
}