package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = -12;
        System.out.println(binarySearchFn(arr, target));
    }

    static int binarySearchFn(int[] arr, int target) {
        // edge case
        if(arr.length == 0) return -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
//                end--;
                end = mid - 1;
            } else {
//                start++;
                start = mid + 1;
            }
        }
        return -1;
    }
}
