package Graphs;

import java.util.HashSet;
import java.util.Set;

public class NumberOfIslandsLC {
    public static void main(String[] args) {
//        char[][] grid = {
//                {'1','1','1','1','0'},
//                {'1','1','0','1','0'},
//                {'1','1','0','0','0'},
//                {'0','0','0','0','0'}
//        };
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        Set<String> seen = new HashSet<>(); // to store and check visited or not
        int count = 0; // to count Number od Islands

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (explore(grid, r, c, seen)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
    static boolean explore(char[][] grid, int r, int c, Set<String> seen) {
        // base && edge conditions ( check out of bounds )
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return false;
        }
        // avoid water
        if(grid[r][c] == '0') return false;

        String pos = r + "," + c;
        if (seen.contains(pos)) {
            return false;
        }
        // marking as visited
        seen.add(pos);

        explore(grid, r + 1, c, seen);
        explore(grid, r - 1, c, seen);
        explore(grid, r, c + 1, seen);
        explore(grid, r, c - 1, seen);

        return true;
    }

}
