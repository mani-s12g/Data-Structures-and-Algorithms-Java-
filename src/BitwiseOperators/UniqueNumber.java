// In array find single unique no , every other no's are duplicates

package BitwiseOperators;

import java.util.Arrays;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
//        int[] arr = {2,3,3,4,2,7,7,7,10,4,2,3,4};
        System.out.println(xorUnique(arr));
//        System.out.println(findUnique(arr));
    }

    // only works for 2 duplicate values
    static int findUnique(int[] arr){
//        int ans = -1;
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        for (int i = 1; i < arr.length; i += 2) {
//            if(arr[i - 1] != arr[i]){
//                ans = arr[i - 1];
//                break;
//            }
//        }
//        if(ans == -1){
//            ans = arr[arr.length - 1];
//        }
//        return ans;

        // 2nd method
        int ans = -1;
        Arrays.sort(arr);
        // for 2 duplicate values use : i += 2
        // for 3 duplicate values use : i += 3
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                ans = arr[i];
                break;
            }
        }

        // If unique is the last element
        if (ans == -1) {
            ans = arr[arr.length - 1];
        }
        return ans;
    }

    // follow below code only
    static int xorUnique(int[] arr){
        int unique = 0;

        // using enhanced for loop
        for (int n: arr){
            unique ^= n;
        }

        // using for loop
        int h = arr[0];
        for (int i = 1; i < arr.length; i++) {
            h ^= arr[i];
        }

        return unique;
//        return h;
    }
}
