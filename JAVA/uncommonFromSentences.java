package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class uncommonFromSentences {
    // 简单hash， 主要是 map 的遍历以及转换为数组不为熟练
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> hm = new HashMap<>();
        String[] sp1 = s1.split(" ");
        String[] sp2 = s2.split(" ");
        for(String s : sp1) {
            hm.put(s, hm.getOrDefault(s, 0)+1);
        }
        for(String s : sp2) {
            hm.put(s, hm.getOrDefault(s, 0)+1);
        }
        ArrayList<String> ans = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : hm.entrySet()) {
            if(entry.getValue() == 1) {
                ans.add(entry.getKey());
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
