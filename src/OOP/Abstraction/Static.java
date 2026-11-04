package OOP.Abstraction;

class Student{
    String name;
    static String school;           /// Static Class

    public static void changeSchool(){
        school = "St. Joseph Convent";
    }
}

public class Static {
    public static void main(String[] args) {

        Student.school = "Don Bosco";

        Student std1 = new Student();
        std1.name = "Tony";

        System.out.println(std1.school);
    }
}
