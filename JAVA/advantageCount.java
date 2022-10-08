package leetcode;

import java.util.Arrays;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/10/8 20:36
 **/
public class advantageCount {

    public int[] advantageCount(int[] nums1, int[] nums2) {
        int len = nums1.length;
        Integer[] index = new Integer[len];
        for(int i = 0; i < len; i++) {
            index[i] = i;
        }
        Arrays.sort(nums1);
        Arrays.sort(index, (i, j) -> nums2[i]-nums2[j]);
        int l = 0, r = len-1;
        for(int num : nums1) {
            if(num > nums2[index[l]]) {
                nums2[index[l++]] = num;
            } else {
                nums2[index[r--]] = num;
            }
        }
        return nums2;
    }

}
