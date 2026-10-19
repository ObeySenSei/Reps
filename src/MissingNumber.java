public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int numbers = 5;

        int result = findNumber(arr,numbers);
        System.out.println("The missing number is: " + result);
    }
    static int findNumber (int[] arr, int numbers){

        int formula = (numbers * (numbers + 1)) / 2;               // say 15

        int actualSum = 0;

        for (int i=0; i< arr.length ;i++){
            actualSum = actualSum + arr[i];
        }

        int missingNumber = formula - actualSum;

        return missingNumber;
    }
}
