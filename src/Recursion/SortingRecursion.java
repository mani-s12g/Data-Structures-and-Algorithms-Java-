package Recursion;

import java.util.Arrays;

public class SortingRecursion {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
//        selection1(arr, arr.length, 0, 0);
//        selection(arr, arr.length, 0);
        bubble(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    // Selection sort using Recursion
    static void selection1(int[] arr, int n, int i, int max){
        if(n == 0) {
            return;
        }
        if(i < n){
            if(arr[i] > arr[max]){
                selection1(arr, n, i + 1, i);
            }else{
                selection1(arr, n, i + 1, max);
            }
        }else{
            swap(arr, max, i - 1);
            selection1(arr, n - 1, 0, 0);
        }
    }

    static void selection(int[] arr, int n, int i){
        if(i == n) {
            return;
        }
        if(i < n){
            int last = n - i - 1;
            int maxIdx = max(arr, last);
            swap(arr, maxIdx, last);
            selection(arr, n, i + 1);
        }
    }

    // Bubble sort using Recursion
    static void bubble(int[] arr, int r, int c){
        if(r == 0)
            return;
        if(c < r - 1){
            if(arr[c] > arr[c + 1]) {
                swap(arr, c, c + 1);
            }
            bubble(arr, r, c + 1);
        }else{
            bubble(arr, r - 1, 0);
        }
    }

    // Helpers below
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
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

}
