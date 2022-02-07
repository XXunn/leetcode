package leetcode;

import javafx.util.Pair;

import java.util.Arrays;

public class longestDiverseString {
    // 贪心， 最优先考虑最大的
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder strBuilder = new StringBuilder();
        // 构造Pair， 并排序
        Pair[] arr = {new Pair(a, 'a'), new Pair(b, 'b'), new Pair(c, 'c')};
        // 注意是每次取值拼接之后，对应的字母频率会发生改变， 我们总要最大的那个， 所以每一轮都要排序
        while(true) {
            Arrays.sort(arr, (p1, p2) -> p2.freq - p1.freq);
            boolean flag = false;
            for(Pair pair : arr) {
                if(pair.freq <= 0) {
                    break;
                }
                int l = strBuilder.length();
                // 如果当前对应的和之前的两个，是一样了， 就继续找下一个和前面两个比较
                if(l >= 2 && strBuilder.charAt(l-2) == pair.ch && strBuilder.charAt(l-1) == pair.ch) {
                    continue;
                }
                // 能找到就把flag设置true
                flag = true;
                strBuilder.append(pair.ch);
                pair.freq--;
                break;
            }
            if(!flag) {
                break;
            }
        }
        return strBuilder.toString();
    }
    class Pair {
        int freq;
        char ch;
        public Pair(int freq, char ch) {
            this.freq = freq;
            this.ch = ch;
        }
    }
}
