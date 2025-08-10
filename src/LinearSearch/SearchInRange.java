package LinearSearch;

import java.util.Arrays;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = -7;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0) return -1;
        for (int i = start; i < end; i++) {
            if(arr[i] == target) return arr[i];
        }

        // actually we should not sort in linear search like below
//        Arrays.sort(arr);
//        while (start < end) {
//            if(arr[start] == target) return arr[start];
//            else if (arr[start] > target) {
//                start--;
//            }else if (arr[start] < target) {
//                start++;
//            }
//        }
        return -1;
    }
}
