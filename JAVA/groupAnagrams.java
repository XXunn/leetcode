package leetcode;

import java.util.*;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/7/25 20:14
 **/
public class groupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        if(strs == null || strs.length == 0) {
            return new ArrayList<List<String>>(map.values());
        }
        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> lst = map.getOrDefault(key, new ArrayList<String>());
            lst.add(s);
            map.put(key, lst);
        }
        return new ArrayList<List<String>>(map.values());
    }

}
