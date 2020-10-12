package Offer12;

class Solution2 {

    public boolean exist(char[][] board, String word) {
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (dfs(i,j, board, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int i, int j, char[][] board, String word, int k) {
        if (i<0 || i>board.length-1 || j<0 || j>board[0].length-1 || word.charAt(k) != board[i][j]) {
            return false;
        }
        if (k == word.length()-1) return true;
        char tmp = board[i][j];
        board[i][j] = '/';
        boolean res =  dfs(i+1, j, board, word, k+1) || dfs(i-1, j, board, word, k+1)
                || dfs(i, j-1, board, word, k+1) || dfs(i, j+1, board, word, k+1);
        board[i][j] = tmp;
        return res;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
//        char[][] board = {
//                {'A', 'B', 'C', 'E'},
//                {'S', 'F', 'C', 'S'},
//                {'A', 'D', 'E', 'E'}
//        };
//        String word = "ABCCED";
//        char[][] board = {
//                {'a', 'a'}
//        };
//        String word = "a";
        char[][] board = {
            {'a', 'b'},
            {'c', 'd'}
        };
        String word = "cdba";
        boolean res = solution2.exist(board, word);
    }
}