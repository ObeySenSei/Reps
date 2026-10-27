package Recursion.Critical;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Target Sum: ");
        int target = in.nextInt();

        ArrayList<String> result = findCombinations("",target);
        System.out.println("Possible combinations: " + result);
        System.out.println("Total count: " + result.size());
    }
    static ArrayList<String> findCombinations (String p, int target){

        ArrayList<String> list = new ArrayList<>();

        if (target == 0){
            list.add(p);
            return list;
        }
        for (int i=1; i<=6; i++){
            if (i<=target){
                list.addAll(findCombinations(p+i, target - i));
            }
        }
        return list;
    }
}
