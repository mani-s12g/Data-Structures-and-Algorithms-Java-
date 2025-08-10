package trying;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = ok1(nums);
        System.out.println(ans);
    }
    static List<List<Integer>> ok1(int[] nums){
        int s = 0, e = nums.length - 1, c = s + 1;
        Arrays.sort(nums);
        return ok(s, c, e, nums);
    }
    static List<List<Integer>> ok(int s, int c, int e, int[] nums) {
        List<List<Integer>> listOfAll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        if(c == nums.length) {
            return new ArrayList<>();
        }
        while(s <= e) {
            int d = nums[s] + nums[c] + nums[e];
            if(d == 0) {
                list.add(nums[s]);
                list.add(nums[c]);
                list.add(nums[e]);
                listOfAll.add(list);
            }else if(d > 0) {
                e--;
            }else{
                s++;
            }
        }
        return ok(s, c++, e, nums);
    }
}
