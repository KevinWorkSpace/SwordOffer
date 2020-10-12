package Offer13;

class Solution {

    private int count = 0;

    public int movingCount(int m, int n, int k) {
        boolean[][] vis = new boolean[m][n];
        return dfs(0,0, m, n, k, vis, 1);
    }

    public int dfs(int x, int y, int m, int n, int k, boolean[][] vis, int size) {
        if (x<0 || x>m-1 || y<0 || y>n-1 || sum(x)+sum(y) > k) return 0;
        if (vis[x][y] == true) return 0;
        vis[x][y] = true;
        return 1 + dfs(x+1, y, m, n, k, vis, size+1) + dfs(x-1, y, m, n, k, vis, size+1) +
                dfs(x, y+1, m, n, k, vis, size+1) + dfs(x, y-1, m, n, k, vis, size+1);
    }

    private int sum(int num) {
        int sum = 0;
        while (num != 0) {
            int last = num % 10;
            num /= 10;
            sum += last;
        }
        return sum;
    }

    public static void main(String[] args) {
        int m = 7;
        int n = 2;
        int k = 3;
        Solution solution = new Solution();
        System.out.println(solution.movingCount(m, n, k));
    }
}
