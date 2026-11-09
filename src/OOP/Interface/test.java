package OOP.Interface;

interface University1 {
    int passMarks = 40;
}
class Science1 implements University1{

    void checkMarks(int marks){
        if (marks >= passMarks){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
class Math1 implements University1{
    void checkMarks(int marks){
        if(marks >= passMarks){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

public class test {
    public static void main(String[] args) {
        Science1 s1 = new Science1();
        Math1 m1 = new Math1();

        s1.checkMarks(41);
        m1.checkMarks(40);

        System.out.println(University.PASSING_MARKS);
    }
}
