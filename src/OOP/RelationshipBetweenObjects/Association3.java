package OOP.RelationshipBetweenObjects;

class Doctor2 {

    String name;                           //  Instance Variables
    String specialization;

    Doctor2(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    void treatPatient(Patient patient) {
        System.out.println("Dr. " + name + " is treating " + patient.name);
    }
}

class Patient {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bookAppointment(Doctor2 doctor, Appointment appointment) {

        System.out.println("\nAppointment Details:");
        System.out.println("Patient: " + name);
        System.out.println("Doctor: Dr. " + doctor.name);
        System.out.println("Specialization: " + doctor.specialization);
        System.out.println("Appointment ID: " + appointment.appointmentId);

        doctor.treatPatient(this);
    }
}

class Appointment {
    int appointmentId;
    String date;
    String time;

    Appointment(int appointmentId, String date, String time) {
        this.appointmentId = appointmentId;
        this.date = date;
        this.time = time;
    }

    void displayAppointment() {
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
    }
}

public class Association3 {
    public static void main(String[] args) {

        Doctor2 d1 = new Doctor2("Abhishek", "Cardiology");
        Patient p1 = new Patient("Mukul", 25);

        Appointment a1 = new Appointment(101, "12-Nov-2026", "10:30 AM");

        p1.bookAppointment(d1, a1);
        a1.displayAppointment();
    }
}