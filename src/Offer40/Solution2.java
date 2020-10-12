package Offer40;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution2 {

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) return new int[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<arr.length; i++) {
            pq.add(arr[i]);
        }
        int[] res = new int[k];
        for (int i=0; i<k; i++) {
            res[i] = pq.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1};
        int k = 1;
        Solution2 solution = new Solution2();
        int[] res = solution.getLeastNumbers(arr, k);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
