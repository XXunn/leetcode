package leetcode;

public class findRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length, temp=0;
        for(int i = 0; i < n; i++) {
            while(i != nums[i]) {
                if(nums[nums[i]] == nums[i]) {
                    return nums[i];
                }
                temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
                for(int x : nums) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
        return temp;
    }
}
