package OOP.Interface;    ///   Program 3: Same variable name in multiple interfaces (Important!)

interface Physics {
    int SPEED = 300000;     // Public static final variable. Final variables cannot be re-assigned.
}

interface Chemistry {
    int SPEED = 1500;
}

class ScienceLab implements Physics, Chemistry {

    void display() {
        System.out.println(Physics.SPEED);
        System.out.println(Chemistry.SPEED);
        // System.out.println(SPEED);  // Compilation error!
    }
}

public class Main3 {
    public static void main(String[] args) {

        ScienceLab lab = new ScienceLab();
        lab.display();
    }
}