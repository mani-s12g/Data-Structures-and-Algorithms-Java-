package Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        InsertionSort(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void InsertionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                    if(arr[j - 1] > arr[j]){
                        swap(arr, j, j - 1);
                    }else{
                        break;
                    }
            }
//            for (int j = i + 1; j < n; j++) {
//                while(j >= 0){
//                    if(arr[i] > arr[j]){
//                        swap(arr, i, j);
//                    }else{
//                        break;
//                    }
//                }
//            }
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++){
            for(int j = i + 1; j >= 1; j--){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
