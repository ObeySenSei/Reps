package Recursion;

public class ReverseRightTraingle {
    public static void main(String[] args) {
        printPattern(5,0);
        printPattern2(5,0);

    }
    static void printPattern(int row, int col){

        if (row==0){
            return;
        }
        if (col < row){
            System.out.print(" *");
            printPattern(row, col + 1);

        } else {
            System.out.println();
            printPattern(row-1,0);
        }
    }
    static void printPattern2(int row, int col){

        if (row==0){
            return;
        }
        if (col < row){
            printPattern2(row, col + 1);
            System.out.print(" *");

        } else {
            printPattern2 (row-1,0);
            System.out.println();
        }
    }
}

