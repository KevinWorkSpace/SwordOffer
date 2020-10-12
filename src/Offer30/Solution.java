package Offer30;

import java.util.Stack;

class MinStack {

    Stack<Integer> a = null;
    Stack<Integer> b = null;
    /** initialize your data structure here. */
    public MinStack() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x) {
        if (b.isEmpty() || b.peek() >= x) {
            b.push(x);
        }
        a.push(x);
    }

    public void pop() {
        if (a.isEmpty()) return;
        int x = a.pop();
        if (x == b.peek()) {
            b.pop();
        }
    }

    public int top() {
        return a.peek();
    }

    public int min() {
        return b.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
