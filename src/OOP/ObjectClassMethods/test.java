package OOP.ObjectClassMethods;
import java.util.HashSet;
import java.util.Objects;

class St{
    String name;

    St(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof St)) return false;
        St other = (St) obj;
        return Objects.equals(name, other.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);

    }
}
public class test{
    public static void main(String[] args) {

        HashSet<St> std = new HashSet<>();

        St st1 = new St("Debanga");
        St st2 = new St("Debanga");

        std.add(st1);
        std.add(st2);

        System.out.println(st1.equals(st2));
        System.out.println(std.size());

    }
}