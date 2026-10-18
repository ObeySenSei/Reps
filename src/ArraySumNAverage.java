public class ArraySumNAverage {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println("The sum of the Elements in the Array is: " + sumArray(arr));
        System.out.println("Their average: " + averageArray(arr));

    }
    static int sumArray(int[] arr){

        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;

    }
    static int averageArray(int[] arr){

        int count = 0;                              // or we can use   int count = arr.length;
        for (int i=0;i<arr.length; i++){            // use double if we want accurate averages in decimals
            count++;
        }
        int sum = sumArray(arr);
        int average = sum / count;

        return average;                          // return   (double) sum / count or arr.length;
    }
}
