package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/6/27 22:42
 **/
public class findLUSlength2 {

    /**
     * 给定字符串列表 strs ，返回其中 最长的特殊序列 。如果最长特殊序列不存在，返回 -1 。
     * 特殊序列 定义如下：该序列为某字符串 独有的子序列（即不能是其他字符串的子序列）。
     *  s 的 子序列可以通过删去字符串 s 中的某些字符实现。
     * 例如，"abc" 是 "aebdc" 的子序列，因为您可以删除"aebdc"中的下划线字符来得到 "abc" 。
     * "aebdc"的子序列还包括"aebdc"、 "aeb" 和 "" (空字符串)。
     * 链接：https://leetcode.cn/problems/longest-uncommon-subsequence-ii
     */
    public int findLUSlength2(String[] strs) {
        int len = strs.length;
        int maxn = -1;
        for(int i = 0; i < len; i++) {
            boolean check = true;
            for(int j = 0; j < len; j++) {
                // 如果 i 串 是 j 的 字串， 那么后续就不需要判断了
                if(i != j && judge(strs[i], strs[j])) {
                    check = false;
                    break;
                }
            }
            // 如果 i 串不是任何串的字串， 就可以更新答案
            if(check) {
                maxn = Math.max(maxn, strs[i].length());
            }
        }
        return maxn;
    }

    // 判断 a 是否是 b 的子串
    private boolean judge(String a, String b) {
        int ptrA, ptrB;
        ptrA = ptrB = 0;
        while(ptrA < a.length() && ptrB < b.length()) {
           if(a.charAt(ptrA) == b.charAt(ptrB)) {
               ptrA++;
               ptrB++;
           } else {
               ptrB++;
           }
        }
        return ptrA == a.length();
    }


}
