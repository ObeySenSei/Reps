package OOP.ObjectClassMethods;

import java.util.Objects;

class St extends Object{
    String name;
    int age;
    St(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj){

        if (this==obj){
            return true;
        }
        if (obj==null || getClass() != obj.getClass()){
            return false;
        }

        St s1 = (St) obj;
        return age == s1.age && Objects.equals(name,s1.name);

    }
}
public class test {
    public static void main(String[] args) {
        St st1 = new St("Debanga",26);
        St st2 = new St("Debanga",26);

        System.out.println(st1==st2);
        System.out.println(st1.equals(st2));

    }
}
