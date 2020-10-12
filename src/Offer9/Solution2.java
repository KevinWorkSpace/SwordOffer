package Offer9;

import java.util.Stack;

class CQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public CQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.add(value);
    }

    public int deleteHead() {
        if (s2.size() > 0) {
            return s2.pop();
        }
        if (s1.isEmpty()) return -1;
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
