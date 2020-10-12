package Offer10_2;

class Solution {

    public int numWays(int n) {
        if (n == 0) return 1;
        if (n <= 2) return n;
        int[] res = new int[n+1];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;
        for (int i=3; i<n+1; i++) {
            res[i] = (res[i-1] + res[i-2]) % 1000000007;
        }
        return res[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numWays(45));
    }
}