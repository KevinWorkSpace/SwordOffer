package Offer17;

import java.util.ArrayList;

class Solution {

    public int[] printNumbers(int n) {
        int[] res = new int[(int) Math.pow(10, n)-1];
        int size = res.length;
        int cnt = 0;
        while (cnt < size) {
            res[cnt] = cnt + 1;
            cnt ++;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 3;
        Solution solution = new Solution();
        int[] res = solution.printNumbers(n);
        for (int i=0; i<res.length; i++) {
            System.out.print(res[i] + " ");
            if ((i+1) % 100 == 0) System.out.println();
        }
    }
}