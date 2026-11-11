package OOP.Enumeration;

enum Week {
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
    /// These are enum constants. They are public static final. And since they are final, they cannot create child enums.
}
public class Main2 {
    public static void main(String[] args) {

        Week week = Week.Monday;

        for(Week day: week.values()){     //  week.values = All the values that week contains
            System.out.println(day);
        }

        System.out.println(week);    // Prints the assigned value of week
        System.out.println(week.ordinal());   // Ordinal is the position of the Enum-Declaration
    }
}
