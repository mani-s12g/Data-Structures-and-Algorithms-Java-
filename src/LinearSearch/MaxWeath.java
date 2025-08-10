package LinearSearch;

public class MaxWeath {
    public static void main(String[] args) {
        int[][] weathMatrix = {
                {1,15},
                {7,13},
                {13,5}
        };
        System.out.println(maxCustomerWeath(weathMatrix));
    }

    static int maxCustomerWeath(int[][] matrix) {
//        int max = 0;
        int max = Integer.MIN_VALUE;;
//        for (int row = 0; row < matrix.length; row++) {
//            // bcoz this is m x n matrix form i.e, no of rows == no of cols we can use both ways
//            // col < matrix[0].length
//            // col < matrix[row].length
//            int sum = 0;
//            for (int col = 0; col < matrix[0].length; col++) {
//                sum += matrix[row][col];
//            }
//            max = Math.max(max, sum);
////            if (sum > max) {
////                max = sum;
////            }
//        }

        // Enhanced for loop
        for (int[] r: matrix) {
            int sum = 0;
            for (int c: r) {
                sum += c;
            }
            if (sum > max) max = sum;
        }
        return max;
    }
}
