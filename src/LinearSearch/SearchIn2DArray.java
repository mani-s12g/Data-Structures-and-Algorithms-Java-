package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12, 45}
        };
        int target = 56;
//        System.out.println(searchInMatrix(arr, target));
//        System.out.println(searchInMatrix2(arr, target));
//        System.out.println(Arrays.toString(searchInMatrix3(arr, target)));
        System.out.println(max(arr));
    }

    static int searchInMatrix(int[][] arr, int target) {
        for (int[] row: arr) {
            for (int col: row) {
                if(target == col) return col;
            }
        }
        return -1;
    }

    static int searchInMatrix2(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) return arr[row][col];
            }
        }
        return -1;
    }

    static int[] searchInMatrix3(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int col : row) {
                if (col > max) {
                    max = col;
                }
            }
        }
        return max;
    }
}
