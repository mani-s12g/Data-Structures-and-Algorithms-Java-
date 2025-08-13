package Arrays.Fundamentals;

import java.util.Arrays;

public class CopyArrayToOtherArray {
    public static void main(String[] args) {
        // 1. Using clone() — full shallow copy
//        Creates a new array with the same elements.
//        For primitive arrays → values are copied.
//        For object arrays → references are copied (shallow copy).

//        int[] original = {1, 3, 4};
//        int[] copy = original.clone();
//        copy[0] = 99;
//        System.out.println(Arrays.toString(original) + " original");
//        System.out.println(Arrays.toString(copy) + " copy");

//        2. Using System.arraycopy() — fastest for primitives
//        Very efficient, especially for large arrays.
//        Can also copy a portion of the array by adjusting indices and length.

//        int[] original = {1, 2, 3, 4, 5};
//        int[] copy = new int[original.length];
//
//        System.arraycopy(original, 0, copy, 0, original.length);
//
//        System.out.println(Arrays.toString(original) + " original");
//        System.out.println(Arrays.toString(copy) + " copy");

//        3. Using Arrays.copyOf()
//        Creates a new array of the given length and copies elements.
//        If new length > original → extra elements are default values (e.g., 0 for int).

        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, original.length);
//        int[] copy = Arrays.copyOf(original, 2);
        System.out.println(Arrays.toString(copy) + " copy");

//        4. Manual loop
//        More control but slower and more verbose.
//        Useful if you want transformations during copying.

//        int[] original = {1, 2, 3};
//        int[] copy = new int[original.length];
//
//        for (int i = 0; i < original.length; i++) {
//            copy[i] = original[i];
//        }
//        System.out.println(Arrays.toString(copy) + " copy");
    }
}
