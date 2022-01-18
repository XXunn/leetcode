package leetcode;

public class dominantIndex {
    public int dominantIndex(int[] nums) {
        int maxn = 0, maxn2 = 0, index = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(maxn < nums[i]) {
                maxn2 = maxn;
                maxn = nums[i];
                index = i;
            } else if(maxn2 < nums[i]) {
                maxn2 = nums[i];
            }
        }
        return maxn >= maxn2*2 ? index : -1;
    }
}
