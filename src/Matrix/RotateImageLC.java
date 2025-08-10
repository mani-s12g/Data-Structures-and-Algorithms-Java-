package Matrix;

public class RotateImageLC
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int row = 0; row <= matrix.length - 1; row++) {
            for(int col = row + 1; col <= matrix[0].length - 1; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        func(matrix);

        for(int[] rows: matrix) {
            for(int values: rows) {
                System.out.print(values + " ");
            }
            System.out.println();
        }
// 		1 4 7
// 		2 5 8
// 		3 6 9

    }

    static void func(int[][] matrix) {
        // reverse the rows
        for(int row = 0; row <= matrix.length - 1; row++) {
            int left = 0; int right = matrix.length - 1;
            while(left < right) {
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;
                left++;
                right--;
            }
        }
    }
}

