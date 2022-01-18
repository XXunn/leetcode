package leetcode;

import java.util.LinkedList;
import java.util.List;

public class generateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new LinkedList<String>();
        dfs(n,n,new StringBuffer(),2*n,ans);
        return ans;
    }
    void dfs(int l, int r, StringBuffer s, int n, List<String> ans) {
        if(s.length() == n) {
            ans.add(s.toString());
            return;
        } else {
            if(l >= r) {
                s.append("(");
                dfs(l-1,r,s,n,ans);
                s.deleteCharAt(s.length()-1);
            } else {
                if(l > 0) {
                    s.append("(");
                    dfs(l-1,r,s,n,ans);
                    s.deleteCharAt(s.length()-1);
                }
                s.append(")");
                dfs(l,r-1,s,n,ans);
                s.deleteCharAt(s.length()-1);
            }
        }
    }
}
