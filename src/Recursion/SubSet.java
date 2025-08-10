// Subsets
// Time Complx = O(n * 2 ^n) => n = no of subsets
// Space Auxiliary = O(2^n * n) => n = space taken by each subset = O(n), 2^n = Total subsets

package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
//        int[] arr = {3, 5, 9};
//        int[] arr = {1, 2, 3};
//        List<List<Integer>> ans = subset(arr);
//        System.out.println(ans);

        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        System.out.println(ans + ": dup");
        for (List<Integer> list: ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr){ // return [ [] ]
        List<List<Integer>> outer = new ArrayList<>(); // outer = []
        System.out.println(outer + "ok");
        outer.add(new ArrayList<>()); // outer = [ [] ]

        for (int num: arr) {
            int n = outer.size(); // initially size = 1, outer = [ [] ]
            System.out.println(n +" size");

            for (int i = 0; i < n; i++) {
            System.out.println(outer +": outer");
                // 1) [], [3], [5, 9]     2) [], [1], [1, 2]
                // 1) [ [] ] => [ [], [] ]  2) [ [], [], [] ] => [ [], [], [] ]
                System.out.println(outer.get(i) + ": outer.get(i)");
                List<Integer> internal = new ArrayList<>(outer.get(i));
                System.out.println(internal + ":internal BEFORE");
                // 1) [] => [], [3] => [], [3], [5], [3, 5] => [9], [3, 9], [5, 9], [3, 5, 9]
                // 2) [] => [], [1] => [], [1], [2], [1, 2] => [3], [1, 3], [2, 3], [1, 2, 3]
                internal.add(num);
                System.out.println(internal + ":internal AFTER");

                // 1) [ [] ] => [ [], [3] ] => [ [], [3], [5], [3, 5] ] => [ [9], [3, 9], [5, 9], [3, 5, 9] ]
                // 2) [ [] ] => [ [], [1] ] => [ [], [1], [2], [1, 2] ] => [ [3], [1, 3], [2, 3], [1, 2, 3] ]
                outer.add(internal);
                System.out.println(outer +" outer");
            }
        }
        return outer;
    }

//    static List<List<Integer>> subsetDuplicate(int[] arr) {
//        Arrays.sort(arr);
//        List<List<Integer>> outer = new ArrayList<>(); // []
//        outer.add(new ArrayList<>()); // [ [] ]
//        int start = 0;
//        int end = 0;
//        for (int i = 0; i < arr.length; i++) {
//            start = 0;
//            if(i > 0 && arr[i] == arr[i - 1]){
//                start = end + 1;
//            }
//            end = outer.size() - 1;
//            int n = outer.size();
//            for (int j = 0; j < n; j++) {
//                List<Integer> internal = new ArrayList<>(outer.get(j));
//                internal.add(arr[i]);
//                outer.add(internal);
//            }
//        }
//        return outer;
//    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
