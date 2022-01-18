package leetcode;

import java.util.Stack;

public class maxDepth {
    public int maxDepth(String s) {
        int stSize = 0, maxn = 0;
        int n = s.length();
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '(') {
                stSize++;
            } else if(s.charAt(i) == ')') {
                maxn = Math.max(maxn, stSize);
                stSize--;
            }
        }
        return maxn;
    }
//    public int maxDepth(String s) {
//        int cnt = 0, maxn = 0, n = s.length();
//        Stack<Character> st = new Stack<Character>();
//        for(int i = 0; i < n; i++) {
//            char curC = s.charAt(i);
//            if(curC == '(') {
//                st.push(curC);
//                cnt++;
//            } else if(curC == ')') {
//                maxn = Math.max(maxn, cnt);
//                st.pop();
//            }
//        }
//        return maxn;
//    }
}
