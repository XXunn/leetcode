package leetcode;

import java.util.*;

public class reorderedPowerOf2 {
    HashSet<String> strings = new HashSet<String>();
    public boolean reorderedPowerOf2(int n) {
        init();
        return strings.contains(StrHandler(n));
//        String[] table = new String[]{"1", "2", "4", "8", "16", "23", "46", "128", "256", "125", "0124", "0248", "0469", "1289", "13468", "23678", "35566", "011237", "122446", "224588", "0145678", "0122579", "0134449", "0368888", "11266777", "23334455", "01466788", "112234778", "234455668", "012356789", "0112344778"};
//        HashSet<String> hs = new HashSet<String>();
//        Collections.addAll(hs, table);
//        char[] nToChars = String.valueOf(n).toCharArray();
//        Arrays.sort(nToChars);
//        return hs.contains(String.valueOf(nToChars));
    }

    public void init() {
        for(int x = 1; x <= 1e9; x<<=1) {
            strings.add(StrHandler(x));
        }
    }

    public String StrHandler(int n) {
        char[] cnt = new char[10];
        while(n > 0) {
            ++cnt[n%10];
            n/=10;
        }
        return new String(cnt);
    }

}
