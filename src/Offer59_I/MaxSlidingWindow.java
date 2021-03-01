package Offer59_I;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(nums[0]);
        for (int i=1; i<k; i++) {
            while (!deque.isEmpty() && nums[i] > deque.getLast()) {
                deque.pollLast();
            }
            deque.add(nums[i]);
        }
        int[] res = new int[nums.length - k + 1];
        res[0] = deque.getFirst();
        for (int i=1; i<res.length; i++) {
            if (nums[i-1] == deque.getFirst()) deque.pollFirst();
            while (!deque.isEmpty() && nums[i + k - 1] > deque.getLast()) {
                deque.pollLast();
            }
            deque.add(nums[i + k - 1]);
            res[i] = deque.getFirst();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        MaxSlidingWindow maxSlidingWindow = new MaxSlidingWindow();
        int[] res = maxSlidingWindow.maxSlidingWindow(nums, k);
    }
}
