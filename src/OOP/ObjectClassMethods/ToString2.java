package OOP.ObjectClassMethods;

class Student2 {
    String name;
    int age;

    Student2(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Name: " + name + " , Age: " + age;
    }

}
public class ToString2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Debanga" , 26);
        System.out.println(s1);

    }
}
