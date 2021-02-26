package Offer57_II;

import java.util.ArrayList;

public class FindContinuousSequence {

    public int[][] findContinuousSequence(int target) {
        if (target <= 2) return null;
        int l = 1;
        int r = 2;
        int sum = 3;
        ArrayList<int[]> res = new ArrayList<>();
        while (l < r) {
            if (sum < target) {
                r ++;
                sum += r;
            }
            else if (sum > target) {
                sum -= l;
                l ++;
            }
            else {
                int[] tmp = new int[r - l + 1];
                for (int i=0; i<tmp.length; i++) {
                    tmp[i] = l + i;
                }
                res.add(tmp);
                sum -= l;
                l ++;
            }
        }
        int[][] ans = new int[res.size()][];
        for (int i=0; i<res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}
