package Offer14_1;

class Solution {

    public int cuttingRope(int n) {
        int[] dp = new int[n+1];
        for (int i=2; i<=n; i++) {
            int max = 0;
            for (int j=1; j<i; j++) {
                long p = Math.max(j * (i-j), j * dp[i-j]) % 1000000007;
                if (p > max) max = (int) p;
            }
            dp[i] = max;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        Solution solution = new Solution();
        System.out.println(solution.cuttingRope(n));
    }
}
