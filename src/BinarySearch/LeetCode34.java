//34. Find First and Last Position of Element in Sorted Array
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

package BinarySearch;

import java.util.Arrays;

public class LeetCode34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,8,8,10};
        int target = 7;

        int[] res = {-1, -1};

        res[0] = findPositions(nums, target, true);
        if(res[0] != -1){
            res[1] = findPositions(nums, target, false);
        }
        System.out.println(Arrays.toString(res));
    }
    static int findPositions(int[] nums, int target, boolean firstPosition){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                ans = mid;
                if(firstPosition){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            } else if (target < nums[mid]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
