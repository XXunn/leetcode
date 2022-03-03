package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/3 9:11
 **/
public class permutation {
    boolean[] vis;
    List<String> ans = new LinkedList<>();
    public String[] permutation(String s) {
        int len = s.length();
        vis = new boolean[len];
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        dfs(chars, 0, len, new StringBuffer());
        // System.out.println(ans.size());
        return ans.toArray(new String[0]);
    }
    void dfs(char[] chars, int curIndex, int n, StringBuffer curChars) {
        if(curIndex == n) {
            ans.add(curChars.toString());
            return;
        }
        for(int i = 0; i < n; i++) {
            if(vis[i] || (i > 0 && !vis[i-1] && chars[i-1]==chars[i])) {
                continue;
            }
            vis[i] = true;
            curChars.append(chars[i]);
            dfs(chars, curIndex+1, n, curChars);
            curChars.deleteCharAt(curChars.length() - 1);
            vis[i] = false;
        }
    }
}
