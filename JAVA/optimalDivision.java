package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 8:41
 **/
public class optimalDivision {
    public String optimalDivision(int[] nums) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int num : nums) {
            stringBuilder.append(num).append("/");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        if(nums.length <= 2) {
            return stringBuilder.toString();
        }
        stringBuilder.append(")");
        stringBuilder.insert(stringBuilder.indexOf("/")+1, "(");
        return stringBuilder.toString();
    }
    // public String optimalDivision(int[] nums) {
    //     StringBuilder stringBuilder = new StringBuilder();
    //     stringBuilder.append(String.valueOf(nums[0]));
    //     if(nums.length == 1) {
    //         return stringBuilder.toString();
    //     }
    //     if(nums.length == 2) {
    //         stringBuilder.append("/").append(String.valueOf(nums[1]));
    //         return stringBuilder.toString();
    //     }
    //     stringBuilder.append("/(").append(String.valueOf(nums[1]));
    //     for(int i = 2; i < nums.length; i++) {
    //         stringBuilder.append("/");
    //         stringBuilder.append(String.valueOf(nums[i]));
    //     }
    //     stringBuilder.append(")");
    //     return stringBuilder.toString();
    // }
}
