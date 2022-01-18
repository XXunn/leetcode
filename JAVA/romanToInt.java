package leetcode;

import java.util.HashMap;
import java.util.Map;

public class romanToInt {
    static Map<Character, Integer> map = new HashMap<Character, Integer>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public static int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        for(int i = 0; i < n; i++) {
            if(i < n-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                ans -= map.get(s.charAt(i));
            } else {
                ans += map.get(s.charAt(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(romanToInt("III"));
        String s = "III";
        System.out.println(map.get(s.charAt(0)));
    }
}
