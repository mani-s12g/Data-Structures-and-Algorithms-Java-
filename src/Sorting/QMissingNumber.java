package Sorting;

import java.util.Arrays;

public class QMissingNumber {
    public static void main(String[] args) {
//        int[] arr = {3, 0, 1};
//        int[] arr = {3,4,-1,1};
        int[] arr = {7,8,9,11,12};
        System.out.print(FindMissingNumber(arr));
    }
    public static int FindMissingNumber(int[] arr){
        // sort first in asc order
        int  i = 0;
        while (i < arr.length){
            int correctIndex = arr[i];
            // arr[i] < arr.length -> Ignore if element is array.length i.e., N, so just take elements below N.
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }

        // search for missing number
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j && j != 0){
                return j;
            }
        }
        // case 2: If all elements are in place i.e., correctly places according to index then return arr length
        return arr.length;
    }

    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
