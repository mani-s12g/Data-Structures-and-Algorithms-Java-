// Prefix Sum / Difference Arrays
// [1, 2, 3, 4, 5] -> normal array
// [1, 3, 6, 10, 15] -> prefixSum of above array

// When to use: Range queries, cumulative sums, subarray sums.
// Complexity target: Preprocessing O(n), queries O(1).

// Common FAANG questions:
//        Subarray Sum Equals K
//        Continuous Subarray Sum divisible by k
//        Range Sum Query (immutable / mutable)
//        Product of Array Except Self

// Tips:
//        Store cumulative info to avoid recomputation.
//        For modulo-based problems, use hash maps to store prefix remainders.

package Prefix_Sum;

import java.util.Arrays;

public class Prefix_sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        prefixSumArr(arr);
//        prefixSumInPlace(arr);
    }
    static void prefixSumArr(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        System.out.println(Arrays.toString(prefixSum));
    }
    static void prefixSumInPlace(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
