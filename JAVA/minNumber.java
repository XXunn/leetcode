package leetcode;

import java.util.Arrays;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/11 23:32
 **/
public class minNumber {
    public String minNumber(int[] nums) {
        String[] snums = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            snums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(snums, (x, y) ->
            (x+y).compareTo(y+x)
        );
        StringBuilder stringBuilder = new StringBuilder();
        for (String snum : snums) {
            stringBuilder.append(snum);
        }
        return stringBuilder.toString();
    }
}
