package Recursion.Critical;

public class PermutationsStringSimple {
    public static void main(String[] args) {
        String str = "abc";
        permutations(str.toCharArray(), 0);
    }
    static void permutations(char[] arr, int fixed){
        if(fixed == arr.length -1){
            System.out.println(arr);
            return;
        }
        for(int i=fixed; i<arr.length;i++){
            swap(arr,fixed,i);
            permutations(arr,fixed + 1);
            swap (arr,fixed,i);
        }
    }
    static void swap (char[]arr, int fixed, int i){
        char temp = arr[i];
        arr[i] = arr[fixed];
        arr[fixed] = temp;
    }
}
