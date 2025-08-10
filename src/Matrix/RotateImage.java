package Matrix;

import java.util.*;
import java.lang.*;

public class RotateImage
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // print 2d matrix using nested Enhanced For loop
        for(int[] rows: matrix) {
            for(int value: rows) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println();
        // print 2d matrix using nestes for loop
        for(int row = 0; row <= matrix.length - 1; row++) {
            for(int col = 0; col <= matrix[0].length - 1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        ArrayList<ArrayList<Integer>> ans = fun(matrix);
        System.out.println(ans); // print 2d ArrayList same like 1d ArrayList
    }

    static ArrayList<ArrayList<Integer>> fun(int[][] matrix) {
        int rowBegin = 0, rowEnd = matrix.length - 1;
        int colBegin = 0, colEnd = matrix[0].length;

        ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
        while(colBegin < colEnd) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = rowEnd; i >= rowBegin; i--) {
                list.add(matrix[i][colBegin]);
            }
            listAll.add(list);
            colBegin++;
        }
        return listAll;
    }
}

