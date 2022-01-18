package leetcode;

import java.util.Stack;

public class validateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        Stack<Integer> stack = new Stack<Integer>();
        int cur = 0;
        for(int num : pushed) {
            stack.push(num);
            while(!stack.empty() && stack.peek() == popped[cur]) {
                stack.pop();
                cur++;
            }
        }
        return stack.isEmpty();
    }
}
