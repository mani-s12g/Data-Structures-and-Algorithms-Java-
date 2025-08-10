//410. Split Array Largest Sum
//https://leetcode.com/problems/split-array-largest-sum/description/

package BinarySearch;

public class LeetCode410 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int k = 2, minSubArrayMax = 0, maxSubArrayMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            minSubArrayMax += arr[i];
            maxSubArrayMax = Math.max(maxSubArrayMax, arr[i]);
        }
        System.out.println(MinLargestSum(arr, k, minSubArrayMax, maxSubArrayMax));
    }
    static int MinLargestSum(int[] arr, int k, int minSubArrayMax, int maxSubArrayMax){
        int start = maxSubArrayMax, end = minSubArrayMax;

        while(start < end){
            int mid = start + (end - start) / 2;
            int pieces = 1;
            int sum = 0;

            for (int element: arr){
                if(sum + element > mid){
                    sum = element;
                    pieces++;
                }else{
                    sum += element;
                }
            }
            if(pieces <= k){
                end = mid;
            }else{
                start = mid + 1;
            }

        }
        return start;
    }
}
