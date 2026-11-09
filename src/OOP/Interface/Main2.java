package OOP.Interface;

interface University {
    int PASSING_MARKS = 40;        ///  When declaring an interface, the variables are always implicitly declared public static final and cannot be Re-assigned.
}

class Science implements University {

    void checkMarks(int marks) {
        if (marks >= PASSING_MARKS) {
            System.out.println("Science: Passed");
        } else {
            System.out.println("Science: Failed");
        }
    }
}

class Commerce implements University {

    void checkMarks(int marks) {
        if (marks >= PASSING_MARKS) {
            System.out.println("Commerce: Passed");
        } else {
            System.out.println("Commerce: Failed");
        }
    }
}

public class Main2 {
    public static void main(String[] args) {

        Science s = new Science();
        Commerce c = new Commerce();

        s.checkMarks(75);
        c.checkMarks(30);
        System.out.println(University.PASSING_MARKS);
    }
}
