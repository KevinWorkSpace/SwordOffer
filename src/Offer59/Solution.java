package Offer59;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class MaxQueue {

    Queue<Integer> queue = null;
    LinkedList<Integer> queue2 = null;

    public MaxQueue() {
        queue = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public int max_value() {
        if (queue2.isEmpty()) return -1;
        return queue2.getFirst();
    }

    public void push_back(int value) {
        queue.add(value);
        while (!queue2.isEmpty() && queue2.getLast() < value) {
            queue2.removeLast();
        }
        queue2.add(value);
   }

    public int pop_front() {
        if (!queue.isEmpty()) {
            int top = queue.poll();
            if (top == queue2.getFirst()) {
                queue2.removeFirst();
            }
            return top;
        }
        else return -1;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
