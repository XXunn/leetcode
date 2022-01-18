package leetcode;

public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1, n = nums.length;
        if(n == 0) {
            return 0;
        }
        while(j < n) {
            if(nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
