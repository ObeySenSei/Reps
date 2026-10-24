package Recursion;
public class R1 {
    public static void main(String[] args) {
        message();

    }
    static void message (){
        System.out.println("Hey");
        message1();
    }
    static void message1 (){
        System.out.println("Hey");
        message2 ();
    }
    static void message2 (){
        System.out.println("Hey");
        message3 ();
    }
    static void message3 (){
        System.out.println("Hey");
        message4 ();
    }
    static void message4 (){
        System.out.println("Hey");
    }
}

// Instead of creating five different methods, you can call the same method from within itself:
