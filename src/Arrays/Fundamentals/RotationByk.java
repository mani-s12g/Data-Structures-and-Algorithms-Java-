// Why this method is good
// Works in-place (no extra array)
// O(n) time complexity
// Handles k > n automatically

package Arrays.Fundamentals;

import java.util.Arrays;

public class RotationByk {
    public static void main(String[] args) {
//        Right Rotation by k
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

//        rightRotation(arr, k);
//        System.out.println(Arrays.toString(arr));

//        Left Rotation by k
//        leftRotation(arr, k);
//        System.out.println(Arrays.toString(arr));

//        rightRotateCopy(arr, k);
        leftRotateCopy(arr, k);
    }
    static void rightRotation(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle k for edge case(if k is more than arr length)
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
    static void leftRotation(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle k for edge case(if k is more than arr length)
//        reverse(arr, 0, k - 1);
//        reverse(arr, 0, n - 1);
//        reverse(arr, 0, k);

//        or
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }
    // reverse array using two-pointer method
    static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

//    Non in-place (simple) method using extra array
//    Right rotate by k using extra array res:
//    k = k % n
//    Copy last k elements into res[0..k-1]
//    Copy first n-k elements into res[k..n-1]
    static void rightRotateCopy(int[] arr, int k) {
        int n = arr.length;
//        if (n == 0) return arr;
        k = k % n;
        int[] res = new int[n];
        System.arraycopy(arr, n - k, res, 0, k);
        System.arraycopy(arr, 0, res, k, n - k);

        System.out.println(Arrays.toString(res));
    }
    static void leftRotateCopy(int[] arr, int k) {
        int n = arr.length;
//        if (n == 0) return arr;
        k = k % n;
        int[] res = new int[n];
        System.arraycopy(arr, k, res, 0, n - k);
        System.arraycopy(arr, 0, res, n - k, k);

        System.out.println(Arrays.toString(res));
    }
}
