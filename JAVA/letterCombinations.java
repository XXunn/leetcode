package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class letterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new LinkedList<String>();
        if(digits.length() == 0) {
            return ans;
        }
        Map<Character, String> map = new HashMap<Character, String>() {
            {
                put('2',"abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };
        dfs(0, digits, new StringBuffer(), ans, map);
        return ans;
    }
    void dfs(int index, String digits, StringBuffer stringBuffer, List<String> ans, Map<Character, String> map) {
        int n = digits.length();
        if(index == n) {
            ans.add(stringBuffer.toString());
            return;
        } else {
            char curChar = digits.charAt(index);
            String pattern = map.get(curChar);
            for(int i = 0; i < pattern.length(); i++) {
                stringBuffer.append(pattern.charAt(i));
                dfs(index+1, digits, stringBuffer, ans, map);
                stringBuffer.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "efgh";
        System.out.println(s1 + s2.charAt(3));
    }
}
