package Recursion.BackTracking;

import java.util.Scanner;

public class test1 {

    public class Fibonacci {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of terms: ");
            int terms = scanner.nextInt();

            int firstTerm = 0;
            int secondTerm = 1;

            System.out.print("Fibonacci Series up to " + terms + " terms: ");

            for (int i = 1; i <= terms; i++) {
                System.out.print(firstTerm + " ");

                // Compute the next term
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }

            scanner.close();
        }
    }
}
