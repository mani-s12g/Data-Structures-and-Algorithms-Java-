package BitwiseOperators;

import java.util.Arrays;

public class LeetCode338 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countBits(n));
    }
    static int[] countBits(int n) {
        int j = 0;
        int[] arr = new int[n + 1];

        for(int k = n; k >= 0; k--){
            int count = 0, i = k;
            boolean isZero = false;
            while(i >= 0 && !isZero){
                if(i == 0){
                    isZero = true;
                }
                int res = i & 1;
                i = i >> 1;
                count += res;
            }
            arr[j++] = count;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
