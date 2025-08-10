package Sorting;

public class DuplicateNo {
    public static void main(String[] args) {
        int[] arr = {5,1,2,4,3,5};
//        int[] arr = {5,1,2,4,3};
        System.out.print(FindDuplicateNo(arr));
    }
    static int FindDuplicateNo(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1){
                return arr[j];
            }
        }
        return -1;
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
