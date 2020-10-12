package Offer9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int value) {
        q1.add(value);
    }

    public int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        else {
            while (q1.size() > 1) {
                q2.add(q1.poll());
            }
            int res = q1.poll();
            while (!q2.isEmpty()) {
                q1.add(q2.poll());
            }
            return res;
        }
    }

    public int top() {
        if (q1.isEmpty()) {
            return -1;
        }
        else {
            while (q1.size() > 1) {
                q2.add(q1.poll());
            }
            int res = q1.poll();
            while (!q2.isEmpty()) {
                q1.add(q2.poll());
            }
            q1.add(res);
            return res;
        }
    }

    public boolean empty() {
        if (q1.isEmpty()) {
            return true;
        }
        return false;
    }
}