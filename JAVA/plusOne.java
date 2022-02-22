package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 15:59
 **/
public class plusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i = n-1; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i]++;
                for(int j = i+1; j < n; j++) {
                    digits[j] = 0;
                }
                return digits;
            }
        }

        int[] ans = new int[n+1];
        ans[0] = 1;
        return  ans;
    }
}
