package OOP.Enumeration;

enum Day {               //  enum Day creates an enumeration named Day.
    MONDAY,
    TUESDAY,             // MONDAY, TUESDAY, etc. are enum constants.
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class Main {
    public static void main(String[] args) {

        Day today = Day.MONDAY;        //  Day today declares a variable of type Day.

        System.out.println(today);
    }
}