package Recursion;

public class RightTriangleSimpleLogic {
    public static void main(String[] args) {
        printPattern (0,0);
    }
    static void printPattern(int row, int col){

        if(row == 5){
            return;
        }
        if (col <= row){
            System.out.print("*");
            printPattern(row,col + 1);
        } else {
            System.out.println();
            printPattern(row + 1, 0);
        }
    }
}
