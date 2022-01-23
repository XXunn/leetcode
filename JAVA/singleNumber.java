package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class singleNumber {
    public int singleNumber(int[] nums) {
        int[] counts = new int[32];
        for(int num : nums) {
            for(int j = 0; j < 32; j++) {
                // 每次取右边的一位
                counts[j] += num & 1;
                num >>= 1;
            }
        }
        int ans = 0, MOD = 3;
        for(int i = 0; i < 32; i++) {
            ans <<= 1;
            // 因为最开始存储是反着来的 counts【0】 存储的是最右边的， 而恢复的时候要从左往右， 所以还原也要反着
            ans |= counts[31-i]%MOD;
        }
        return ans;
    }
}
