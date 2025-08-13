// Remove duplicated from sorted array
package Arrays.Fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDupFromSortedArr {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 3, 4, 4, 6, 7, 8, 8};
        int[] arr = {1, 2, 3, 3};

        // all following for unsorted array , first sort array then it will work
        removeDuplicates(arr); // 1st method in-place

//        int newLength = removeDuplicatesInPlace(arr); // 2nd method in-place
//        for (int i = 0; i < newLength; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        int length = removeDuplicatesUsingHashSet(arr); // 3rd method in-place
//        // Print the array up to the new length
//        for (int i = 0; i < length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        int[] unique = removeDuplicatesNotInPlace(arr);
//        System.out.println(Arrays.toString(unique));
    }
    static void removeDuplicates(int[] arr) {
        // also its  in-place solution
        if (arr.length == 0) return;
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
//                System.out.println("Dup present");
//                return;
            }
        }
//        System.out.println("Not present");
        int lastElement = arr[arr.length - 1];
        arr[j++] = arr[lastElement]; // increase j here coz last index is exclusive for Arrays.copy fn so
        System.out.println(Arrays.toString(Arrays.copyOf(arr, j)));
    }
    static int removeDuplicatesInPlace(int[] arr) {
        if (arr.length == 0) return 0;
        // Use two-pointer method
        int j = 0; // slow pointer for unique elements
        for (int i = 1; i < arr.length; i++) {
            if(arr[j] != arr[i]) { // found a new element
                j++;
                arr[j] = arr[i]; // place it in next position
            }
        }
//        System.out.println(Arrays.toString(arr));
        return j + 1; // new length & arr is modified in place as well
    }
    static int removeDuplicatesUsingHashSet(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        int j = 0; // pointer for placing unique elements

        for (int num: arr) {
            if(!seen.contains(num)) {
                seen.add(num);
                arr[j++] = num; // overwrite in-place
            }
        }return j; // new length
    }

//    Not in place (Not efficient for unsorted arrays)
//    Why this is different
//    Uses a dynamic list (ArrayList) instead of manually counting first.
//    Still works in O(n) time for sorted arrays.
//    The list automatically grows, so no need to pre-calculate the size.
    static int[] removeDuplicatesNotInPlace(int[] arr) {
        if (arr.length == 0) return new int[0];
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]); // first element is always unique

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { // skip duplicates
                list.add(arr[i]);
            }
        }
        // Convert List<Integer> to int[]
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
