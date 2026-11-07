package OOP.Encapsulation;

class Student{
    private String name;
    private int age;

    public String getName(){         /// Getter
        return name;
    }
    public void setName(String name){   /// Setter
        this.name = name;
    }
    public int getAge(){             /// Getter
        return age;
    }
    public void setAge(int age){     /// Setter
        this.age = age;                                  //  this.age refers to that particular instance variable.
    }                                                    // The instance variable receives the value 26.
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Debanga");        // s1.setAge(26) calls the public setter method
        s1.setAge(26);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
