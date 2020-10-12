package Offer12;

class Solution {

    boolean flag = false;

    public boolean exist(char[][] board, String word) {
        StringBuilder s = new StringBuilder();
        boolean[][] vis = new boolean[board.length][board[0].length];
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    vis[i][j] = true;
                    rec(board, i, j, s, word, vis);
                    s.deleteCharAt(s.length()-1);
                    vis[i][j] = false;
                }
            }
        }
        return flag;
    }

    public void rec(char[][] board, int i, int j, StringBuilder s, String word, boolean[][] vis) {
        s.append(board[i][j]);
        vis[i][j] = true;
        if (s.length() > word.length() || s.charAt(s.length()-1) != word.charAt(s.length()-1)) return;
        if (s.toString().equals(word)) {
            flag = true;
            return;
        }
        if (flag) return;
        if (i-1 >= 0 && !vis[i-1][j]) {
            rec(board, i-1, j, s, word, vis);
            s.deleteCharAt(s.length()-1);
            vis[i-1][j] = false;
        }
        if (i+1 < board.length && !vis[i+1][j]) {
            rec(board, i+1, j, s, word, vis);
            s.deleteCharAt(s.length()-1);
            vis[i+1][j] = false;
        }
        if (j-1 >= 0 && !vis[i][j-1]) {
            rec(board, i, j-1, s, word, vis);
            s.deleteCharAt(s.length()-1);
            vis[i][j-1] = false;
        }
        if (j+1 < board[0].length && !vis[i][j+1]) {
            rec(board, i, j+1, s, word, vis);
            s.deleteCharAt(s.length()-1);
            vis[i][j+1] = false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        char[][] board = {
//                {'A', 'B', 'C', 'E'},
//                {'S', 'F', 'C', 'S'},
//                {'A', 'D', 'E', 'E'}
//        };
//        String word = "ABCCED";
        char[][] board = {
                {'a', 'a'}
        };
        String word = "a";
//        char[][] board = {
//            {'a', 'b'},
//            {'c', 'd'}
//        };
//        String word = "cdba";
        solution.exist(board, word);
    }
}
