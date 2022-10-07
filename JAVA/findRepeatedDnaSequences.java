package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/7/28 22:48
 **/
public class findRepeatedDnaSequences {
    static final int L = 10;

    Map<Character, Integer> bin = new HashMap<Character, Integer>() {{
        put('A', 0);
        put('C', 1);
        put('G', 2);
        put('T', 3);
    }};

    public List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String> ans = new ArrayList<>();
        int n = s.length();
        if(n < L) {
            return ans;
        }
        int x = 0;
        // 初始化串
        for(int i = 0; i < L-1; i++) {
            x = (x << 2) | bin.get(s.charAt(i));
        }
        Map<Integer, Integer> cnt = new HashMap<>();
        for(int i = 0; i <= n-L; i++) {
            x = ((x << 2) | bin.get(s.charAt(i+L-1))) & ((1 << (L*2)) - 1);
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
            if(cnt.get(x) == 2) {
                ans.add(s.substring(i, i+L));
            }
        }
        return ans;
    }
}