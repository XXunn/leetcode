package leetcode;

import java.util.ArrayList;

public class pivotArray {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        int l = 0, r = n-1;
        for(int i = 0; i < n; i++) {
            if(nums[i] < pivot) {
                ans[l++] = nums[i];
            }
            if(nums[i] > pivot) {
                ans[r--] = nums[i];
            }
        }
        while(l <= r) {
            ans[l++] = pivot;
        }
        reverseArray(ans, r+1, n-1);
        return ans;
    }
    private void reverseArray(int[] arr, int i, int j) {
        int temp;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
}
