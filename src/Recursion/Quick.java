package Recursion;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
    }
    static void sort(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low, e = hi, m = s + (e - s) / 2, pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (pivot < nums[e]) {
                e--;
            }
            // also a reason why if its already sorted it will not swap
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, hi);
    }
}
