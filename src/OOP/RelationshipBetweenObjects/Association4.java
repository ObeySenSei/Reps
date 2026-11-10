package OOP.RelationshipBetweenObjects;

class Doctor4 {
    String name;
    String specialization;

    Doctor4(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    void treatPatient(Patient4 patient) {
        System.out.println("Dr. " + name + " is treating " + patient.name);
    }
}

class Patient4 {
    String name;
    int age;

    Patient4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bookAppointment(Doctor4 doctor, Appointment4 appointment) {

        System.out.println("\nAppointment Details:");
        System.out.println("Patient: " + name);
        System.out.println("Doctor: Dr. " + doctor.name);
        System.out.println("Specialization: " + doctor.specialization);
        System.out.println("Appointment ID: " + appointment.appointmentId);

        doctor.treatPatient(this);
    }
}

class Appointment4 {
    int appointmentId;
    String date;
    String time;

    Appointment4(int appointmentId, String date, String time) {
        this.appointmentId = appointmentId;
        this.date = date;
        this.time = time;
    }

    void displayAppointment() {
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
    }
}

public class Association4 {
    public static void main(String[] args) {

        // Creating ONE Doctor object
        Doctor4 d1 = new Doctor4("Abhishek", "Cardiology");

        // Creating TWO different Patient objects
        Patient4 p1 = new Patient4("Mukul", 25);
        Patient4 p2 = new Patient4("Rahul", 30);

        // Creating separate Appointment objects
        Appointment4 a1 = new Appointment4(101, "12-Nov-2026", "10:30 AM");
        Appointment4 a2 = new Appointment4(102, "12-Nov-2026", "11:30 AM");

        // Both patients use the SAME Doctor object
        p1.bookAppointment(d1, a1);
        p2.bookAppointment(d1, a2);
    }
}