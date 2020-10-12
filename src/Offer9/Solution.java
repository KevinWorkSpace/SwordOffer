package Offer9;

import java.util.Stack;

class CQueue2 {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public CQueue2() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        s1.push(value);
    }

    public int deleteHead() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        if (s2.isEmpty()) return -1;
        return s2.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
