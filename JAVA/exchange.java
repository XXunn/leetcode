package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 9:34
 **/
public class exchange {
    public int[] exchange(int[] nums) {
        int l = 0, r = nums.length - 1;
        while(l < r) {
            while(l < r && (nums[l]&1)==1) {
                l++;
            }
            while(l < r && (nums[r]&1)==0) {
                r--;
            }
            swap(nums, l, r);
            l++;
            r--;
        }
        return nums;
    }
    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
