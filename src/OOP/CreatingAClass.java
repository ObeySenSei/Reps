package OOP;

class Students {
    int[] rollno = new int[5];
    String[] names = new String[5];
    float[] marks = new float[5];
}

public class CreatingAClass {
    public static void main(String[] args) {
        // Instantiate the object that holds all the arrays
        Students batch = new Students();

        // Assign values into the internal arrays
        batch.rollno[0] = 18;
        batch.marks[0] = 96;
        batch.names[0] = "Debanga Hazarika";

        batch.rollno[2] = 16;
        batch.marks[2] = 92;
        batch.names[2] = "Debojyoti Saha";

        System.out.println("Name: " + batch.names[2] + " Marks: " + batch.marks[2]);

    }
}