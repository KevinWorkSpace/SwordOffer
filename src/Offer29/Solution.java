package Offer29;

class Solution {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int[] res = new int[matrix.length * matrix[0].length];
        int cnt = 0;
        int t = 0;
        int b = matrix.length - 1;
        int l = 0;
        int r = matrix[0].length - 1;
        while (cnt < res.length) {
            for (int i=l; i<=r; i++) {
                res[cnt++] = matrix[t][i];
            }
            if (cnt == res.length) break;
            t++;
            for (int i=t; i<=b; i++) {
                res[cnt++] = matrix[i][r];
            }
            if (cnt == res.length) break;
            r--;
            for (int i=r; i>=l; i--) {
                res[cnt++] = matrix[b][i];
            }
            if (cnt == res.length) break;
            b--;
            for (int i=b; i>=t; i--) {
                res[cnt++] = matrix[i][l];
            }
            if (cnt == res.length) break;
            l++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Solution solution = new Solution();
        solution.spiralOrder(matrix);
    }
}