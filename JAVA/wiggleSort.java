package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/6/28 21:22
 **/
public class wiggleSort {
    public void wiggleSort(int[] nums) {
        int []arr = nums.clone();
        Arrays.sort(arr);
        int n = nums.length;
        int x = (n+1) / 2;
        for(int i = 0, j = x - 1, k = n-1; i < n; i += 2, j--, k--) {
            nums[i] = arr[j];
            if(i + 1 < n) {
                nums[i+1] = arr[k];
            }
        }
    }
}
