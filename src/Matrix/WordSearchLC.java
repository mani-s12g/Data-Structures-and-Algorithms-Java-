package Matrix;

public class WordSearchLC {
    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCCED";
//        String word = "SEE";
        System.out.println(exist(board, word));
    }
    static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        // Loop through every cell in the grid
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (dfs(board, word, r, c, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    static boolean dfs(char[][] board, String word, int r, int c, int index) {
        // If all characters are matched
        if (index == word.length()) {
            return true;
        }

        // Out of bounds or not matching
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length
                || board[r][c] != word.charAt(index)) {
            return false;
        }

        // Mark current cell as visited by temporarily changing the value
        char temp = board[r][c];
        board[r][c] = '#';

        // Explore all 4 directions
        boolean found = dfs(board, word, r + 1, c, index + 1) ||
                dfs(board, word, r - 1, c, index + 1) ||
                dfs(board, word, r, c + 1, index + 1) ||
                dfs(board, word, r, c - 1, index + 1);

        // Restore the original value
        board[r][c] = temp;

        return found;
    }
}
