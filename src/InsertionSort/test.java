package InsertionSort;

public class test {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];                   // temp = 3
            int j = i - 1;                       // j = 0, arr[j] = 5

            while (j >= 0 && arr[j] > temp) {    // is 5 > 3? YES
                arr[j + 1] = arr[j];             // arr[1] = arr[0] → 5 = 5
                // Array becomes [5, 5]
                j--;                             // j = -1
            }
            arr[j + 1] = temp;                   // arr[0] = 3       Array becomes [3, 5]
        }
    }
}
