//Also known as Sinking sort, Stable and Unstable sort

package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2, 7, 1, 0, 9};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        String s = "ana";
        char[] ch = s.toCharArray();
        System.out.println(ch[0] + ": s");
    }
    static void BubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
//            for (int j = 1; j <= n - i - 1; j++) {
            for (int j = 1; j < n - i; j++) {
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
