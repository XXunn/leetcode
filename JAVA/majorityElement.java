package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/3 8:30
 **/
public class majorityElement {
    public int majorityElement(int[] nums) {
        int cur = nums[0];int cnt = 1;
        int len = nums.length;
        for(int i = 1; i < len; i++) {
            if(nums[i] == cur) {
                cnt++;
            } else {
                if(cnt >= 1) {
                    cnt--;
                } else {
                    cur = nums[i];
                    cnt = 1;
                }
            }
        }
        return cur;
    }
}
