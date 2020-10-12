package Offer16;

class Solution {

    public double myPow(double x, int n) {
        if (x == 1) return x;
        if (n == 0) return 1;
        double res = 1;
        long b = n;
        if (b < 0) {
            x = 1/x;
            b = -b;
        }
        while (b != 0) {
            if ((b & 1) == 1) {
                res *= x;
            }
            x *= x;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
//        double x = 2;
//        int n = -2147483648;
        double x = 2;
        int n = 2147483647;
        Solution solution = new Solution();
        double res = solution.myPow(x, n);
        System.out.println(res);
    }

}
