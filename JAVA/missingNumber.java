package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/1 22:24
 **/
public class missingNumber {
    public int missingNumber(int[] nums) {
        int ans = 0, len = nums.length;
        for(int i = 0; i < len; i++) {
            ans ^= nums[i];
            ans ^= i;
        }
        return ans^len;
        // int sum = 0;
        // int len = nums.length;
        // for(int num : nums) {
        //     sum += num;
        // }
        // return (len*(len+1)/2) - sum;
    }
}
