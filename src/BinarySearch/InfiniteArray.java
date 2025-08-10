package BinarySearch;

//package com.kunal;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 7;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);

    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}

//public class InfiniteArray {
//    public static void main(String[] args){
//        int[] arr = {2, 3, 4, 7, 9, 12, 15, 18, 20, 22, 26, 29, 30, 32, 37, 40, 45, 56, 63, 78};
//        int target = 40;
//        System.out.println(findStartEndAndTarget(arr, target));
//    }
//    static int findStartEndAndTarget(int[] arr, int target){
//        int start = 0;
//        int end = 1;
//
//        while(target > arr[end]){
//            int newStart = end + 1;
//            end = end + (end - start + 1) * 2;
//            start = newStart;
//        }
//        return binarySearch(arr, start, end, target);
//    }
//    static int binarySearch(int[] arr, int start, int end, int target){
//        while (start <= end){
//            int mid = start + (end - start) / 2;
//            if(target < arr[mid]){
//                end = mid - 1;
//            } else if (arr[mid] < target) {
//                start = mid + 1;
//            }else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//}
