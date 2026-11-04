package OOP;

class Student6 {
    private String namee;
    private int age;

    public String getName() {              /// Getter
        return namee;
    }

    public void setName(String name) {     /// Setter
        this.namee = name;
    }

    public int getAge() {                  /// Getter
        return age;
    }

    public void setAge(int age) {          /// Setter
        if (age > 0) {
            this.age = age;
        }
    }
}
public class GettersSetters {
    public static void main(String[] args) {
        Student6 s1 = new Student6();

        s1.setName("Rahul");
        s1.setAge(21);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}

