package OOP.staticEx;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human ("Debanga", 18, 50000, false);
        Human h2 = new Human ("Debojyoti", 18, 54000, true);

        System.out.println(h1.name + " " + h1.salary);
        System.out.println(h2.age + " " + h2.married);

        System.out.println(h1.population);
        System.out.println(h2.population);

    }
}

/// Example of using a Human class from another file in the same Package.