package OOP.Generics.CompareObjects;

class Student implements Comparable<Student>{
    int age;

    Student(int age){
        this.age = age;
    }
    @Override
    public int compareTo(Student other){
        return this.age - other.age;
    }
}
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(24);
        Student s2 = new Student(26);
        Student s3 = new Student(28);


        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s3.compareTo(s1));
    }
}
/*
      Return value	  Meaning
      Negative	      Current object is smaller
      Zero	          Both objects are equal in ordering
      Positive	      Current object is greater
 */
