package leetcode;

import java.util.Stack;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/25 14:34
 **/
class CQueue {
    private Stack<Integer> st1, st2;
    public CQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void appendTail(int value) {
        st1.push(value);
    }

    public int deleteHead() {
        if(st2.isEmpty()) {
            while(!st1.isEmpty()) {
                Integer value = st1.pop();
                st2.push(value);
            }
        }
        return st2.isEmpty() ? -1 : st2.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */