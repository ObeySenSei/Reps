import java.util.Scanner;
public class FactorsofNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println("Factors of " + num + " are: ");
        findFactors(num);
        in.close();
    }

    static void findFactors(int num){

        for (int i=1; i<=num; i++){
            if (num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
