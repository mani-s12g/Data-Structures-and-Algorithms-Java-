package Recursion.Backtracking;

public class matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
//        int[][] matrix = new int[][]{
//                {1, 2, 3},
//                {4, 90, 6},
//                {7, 8, 9}
//        };
//        int[][] matrix = new int[][]{
//                {0, 1, 0, 0},
//                {0, 0, 3, 0},
//                {0, 3, 0, 0},
//                {0, 0, 4, 0},
//        };
//        for (int[] rows: matrix) {
//            for (int col: rows) {
//                System.out.print(col+ " ");
//            }
//            System.out.println();
////            if(rows[2] == 4){
////                System.out.println("yes");
////            }
////            System.out.println("No");
//        }
//        for (int row = 0; row < matrix.length; row++) { // matrix.length = number of rows
//            for (int col = 0; col < matrix.length; col++) { // matrix[row].length = number of columns in current row
//                System.out.print(matrix[row][col] + " ");
//            }
//            System.out.println(); // move to next line after each row
//        }

//        int row = 2, col = 1;
        int row = 2;
        int sqrt = 2;
//        int sqrt = (int)(Math.sqrt(9));
        System.out.println(sqrt + ": sqrt");
        int rowStart = row - row % sqrt;
//        int colStart = col - col % sqrt;
        System.out.println(rowStart + ": rowStart");
//        System.out.println(colStart + ": colStart");
    }
}
