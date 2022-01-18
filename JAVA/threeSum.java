package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) {
                return ans;
            }
            if(i > 0 && nums[i]==nums[i-1]) {
                continue;
            }
            int l = i+1, r = n-1, target = -nums[i];
            while(l < r) {
                int sum = nums[l] + nums[r];
                if(sum < target) {
                    l++;
                } else if (sum > target) {
                    r--;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l < r && nums[l]==nums[l+1]) {
                        l++;
                    }
                    while(l < r && nums[r]==nums[r-1]) {
                        r--;
                    }
                    l++;r--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []a = {-1,0,1,2,-1,-4};
        threeSum(a);
    }
    /*public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int n = nums.length;
        if(n < 3) {
            return ans;
        }
        Arrays.sort(nums);
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) {
                break;
            }
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i+1, r = n-1;
            while(l < r) {
                int sum = nums[l] + nums[r] + nums[i];
                if(sum == 0) {
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l < r && nums[l] == nums[l+1]) {
                        l++;
                    }
                    l++;
                    while(l < r && nums[r] == nums[r-1]) {
                        r--;
                    }
                    r--;
                } else if(sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        for(List<Integer> l : ans) {
            System.out.println(l);
        }
        return ans;
    }*/
}
