package leetcode;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/7/13 21:13
 **/
public class asteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        st.push(Integer.MIN_VALUE);
        for(int num : asteroids) {
            if(num > 0) {
                st.push(num);
            } else {
                while(st.peek() > 0 && st.peek() < -num) {
                    st.pop();
                }
                if(st.peek() < 0) {
                    st.push(num);
                } else if(st.peek() == -num) {
                    st.pop();
                }
            }
        }
        int[] ans = new int[st.size()-1];
        int idx = 0;
        while(st.size() > 1) {
            ans[idx++] = st.pop();
        }
        for(int i = 0; i < ans.length/2; i++) {
            ans[i] += ans[ans.length - i - 1];
            ans[ans.length - i - 1] = ans[i] - ans[ans.length - i - 1];
            ans[i] = ans[i] - ans[ans.length - i - 1];
        }
        return ans;
    }

}
