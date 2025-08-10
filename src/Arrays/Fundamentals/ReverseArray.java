package Arrays.Fundamentals;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9};
//        String[] s = {"I", "N", "D", "I", "A"};
//        reverseFn(arr); // reverse array of numbers
//        reverse2(arr);  // reverse array of numbers
//        System.out.print(Arrays.toString(arr));

        // 2 pointer method
//        reverseStringTwoPointerMethodFn(s);  // reverse array of String
//        System.out.print(Arrays.toString(s));
    }

    // not so optimized method
    static void reverse2(int[] arr){
        int n = arr.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            // arr[arr.length - 1 - i]
            res[i] = arr[n - 1 - i];
            // res[0] = 5 - 1 - 0 // arr.length - 1 - i
            // res[1] = 5 - 1 - 1
            // res[2] = 5 - 1 - 2
            // res[3] = 5 - 1 - 3
            // res[4] = 5 - 1 - 4
        }
        System.out.println(Arrays.toString(res) + ": res");
//        for (int i = 0; i < n; i++) {
//            arr[i] = res[i];
//        }

    }

    // more optimized method
    static void reverseFn(int[] arr){
        int start = 0, end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // 2 pointer method
    static void reverseStringTwoPointerMethodFn(String[] s){
        int start = 0, end = s.length-1;
        while(start < end){
            swap(s, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void swap(String[] s, int start, int end){
        String temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }
}
