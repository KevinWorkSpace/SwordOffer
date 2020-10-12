package Offer40;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) return new int[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i=0; i<arr.length; i++) {
            if (pq.isEmpty() || pq.size() < k) {
                pq.add(arr[i]);
            }
            else if (pq.peek() > arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
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
        Solution solution = new Solution();
        int[] res = solution.getLeastNumbers(arr, k);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
