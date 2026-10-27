package Recursion.Critical;
import java.util.ArrayList;
import java.util.Scanner;

public class DiceRollArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter target sum: ");
        int target = scan.nextInt();

        // Calling the method to get all dice combinations as an ArrayList
        ArrayList<String> result = diceRet("", target);

        System.out.println("Combinations: " + result);
        System.out.println("Total count: " + result.size());

        scan.close();
    }

    static ArrayList<String> diceRet(String p, int target) {
        ArrayList<String> list = new ArrayList<>();

        // Base case: if the target is reached, add the current combination to the list
        if (target == 0) {
            list.add(p);
            return list;
        }

        // Assuming a standard 6-faced die (faces 1 through 6)
        for (int i = 1; i <= 6; i++) {
            if (i <= target) {
                list.addAll(diceRet(p + i, target - i));
            }
        }
        return list;
    }
}
/**
 *
 for (int i = 1; i <= 6 && i <= target; i++) {
 list.addAll(diceRet(p + i, target - i));

 // i <= target because You cannot roll a number larger than your remaining target

 */