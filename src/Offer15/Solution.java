package Offer15;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0) {
            if ((n & 1) == 1) cnt ++;
            n = n >>> 1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int n = 0b11111111111111111111111111111101;
        Solution solution = new Solution();
        int cnt = solution.hammingWeight(n);
        System.out.println(cnt);
    }
}
