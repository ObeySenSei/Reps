public class Prime {
    public static void main(String[] args) {
        int num = 12;
        boolean isPrime = checkPrime (num);
        if (isPrime){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    static boolean checkPrime (int num){
        if (num < 2){
            return false;
        }
        int count = 0;
        int i = 1;

        while (i<=num){
            if (num % i == 0){
                count++;
            }
            i++;
        }
        if (count == 2){
            return true;        // or we can use return count == 2;
        }else {
            return false;
        }
    }
}
