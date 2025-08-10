//33. Search in Rotated Sorted Array
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

package BinarySearch;

public class LeetCode33 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 1, 2, 3, 4};
        int target = 6;
        System.out.println(findPivot(arr));

        int pivot = findPivot(arr);
        if (pivot == target) {
            System.out.println(pivot);
        }

        if (pivot == -1) {
            System.out.println(searchRotatedArray(arr, target, 0, arr.length - 1));
        } else {
            System.out.println(searchRotatedArray(arr, target, 0, pivot - 1));
        }

//        System.out.println(searchRotatedArray(arr, target, pivot + 1, arr.length - 1));
    }

    // more optimized
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid + 1]){
                return mid;
            } else if (start < mid && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }else if(nums[start] < nums[mid]){ //here no need to check for if mid < end or arr[mid] < arr[mid + 1]
                // bcoz these are obvious conditions so. it will be satisfied anyway so.
                start = mid;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

//    static int findPivot(int[] arr){
//        int start = 0;
//        int end = arr.length - 1;
//        while(start < end){
//            int mid = start + (end - start) / 2;
//            if(mid < end && arr[mid] > arr[mid + 1]){
//                return mid;
//            } else if (start < mid && arr[mid] < arr[mid - 1]) {
//                return mid - 1;
//            }else if(mid < end && arr[mid] < arr[mid + 1] && arr[start] < arr[mid]){
//                start = mid;
//            } else if (arr[start] > arr[mid]) {
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }
//
    static int searchRotatedArray(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
