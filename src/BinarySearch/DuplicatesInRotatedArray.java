//33. Search in Rotated Sorted Array
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

package BinarySearch;

public class DuplicatesInRotatedArray {
    public static void main(String[] args){
        int[] arr = {2, 2, 5, 5, 7, 9, 0, 1, 2};
        int target = 5;
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
    }

        static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            } else if (start < mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] == arr[start]) {
                if(start < end && arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(end > start && arr[end - 1] > arr[end]){
                    return end - 1;
                }
                end--;
            } else if(arr[start] < arr[mid]){
                start = mid + 1;
            } else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }

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
