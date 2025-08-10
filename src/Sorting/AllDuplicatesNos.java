package Sorting;

import java.util.ArrayList;

public class AllDuplicatesNos {
    public static void main(String[] args) {
        int[] arr = {5,1,2,4,3,5,7,7};
        System.out.print(AllDuplicatesNos(arr));
    }
    static ArrayList<Integer> AllDuplicatesNos(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1){
                list.add(arr[j]);
            }
        }
        return list;
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
