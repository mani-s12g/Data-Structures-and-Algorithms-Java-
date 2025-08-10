// Cyclic sort Conditions:
// Input array has to be from [0, n] or [1, n] ( means no negative number should be there in array)
// has to be continuous numbers in array it can be sorted or not sorted.
// Example:
// Correct input array: [2,4,1,5,3,6] // all numbers are good and continuous
// Wrong i/p array: [2,4,1,5,3,6,8] // here 8 is present and before number 7 is not present so
// its not continuous array
// And No Duplicates in array

//Cyclic sort will not work if array contains negative no's, non continuous no's and duplicates


package Sorting;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,6};
        CyclicSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void CyclicSort(int[] arr){
        int  i = 0;
        //kunal's approach (good)
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else if (correctIndex == i){
                i++;
            }
        }

        // my approach (i tried and did !)
//        while (i < arr.length){
//            int putToIndex = arr[i] - 1;
//            if(putToIndex != i){
//                swap(arr, i, putToIndex);
//            }else if (putToIndex == i){
//                i++;
//            }
//        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
