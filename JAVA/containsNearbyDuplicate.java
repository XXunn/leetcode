package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class containsNearbyDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < k; i++) {
            if(hs.contains(nums[i])) {
                return true;
            }
            hs.add(nums[i]);
            if(hs.size() > k) {
                hs.remove(nums[i-k]);
            }
        }
        return false;
    }

    //public boolean containsNearbyDuplicate(int[] nums, int k) {
    //    int i = 0, j = 0, n = nums.length;
    //    for(i = 0; i < n; i++) {
    //        for(j = i+k; j < n; j++) {
    //            if(nums[i]==nums[j]) {
    //                return true;
    //            }
    //        }
    //    }
    //    return false;
    //}
}
