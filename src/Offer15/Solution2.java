package Offer15;

public class Solution2 {

    public int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt ++;
            n = n & (n - 1);
        }
        return cnt;
    }
}
