package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 5};
//        int[] arr = {1, 2, 3, 4, 9};
        SelectionSort(arr);
//        reverse(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }
    static void SelectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int lastIndex = n - i - 1;
            int maxIndex = max(arr, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static int max(int[] arr, int lastIndex){
        int max = 0;
        for (int i = 0; i <= lastIndex; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int maxIndex, int lastIndex){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }
    // i did this following as well
    static void selectionSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - i; i++){
            if(arr[i] > max){
                int correct = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
