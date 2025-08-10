package Sorting;

import java.util.ArrayList;

public class DisappearingNos {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.print(FindDisappearingNos(arr));
    }
    static ArrayList<Integer> FindDisappearingNos(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

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
                list.add(j + 1);
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
