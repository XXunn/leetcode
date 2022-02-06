package leetcode;

public class sumOfUnique {
    private int[] a = new int[101];
    public int sumOfUnique(int[] nums) {
        int ans = 0, n = nums.length;
        for(int num : nums) {
            a[num]++;
        }
        for(int i = 1; i <= 100; i++) {
            if(a[i] == 1) {
                ans += i;
            }
        }
        return ans;
    }
}
