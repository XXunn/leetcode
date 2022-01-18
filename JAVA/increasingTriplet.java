package leetcode;

import java.util.ArrayList;

public class increasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n < 3) {
            return false;
        }
        int []numl = new int[n];
        int []numr = new int[n];
        numl[0] = nums[0];
        numr[n-1] = nums[n-1];
        for(int i = 1; i < n; i++) {
            if(nums[i] >= numl[i-1]) {
                numl[i] = numl[i-1];
            } else {
                numl[i] = nums[i];
            }
            if(nums[n-1-i] >= numr[n-i]) {
                numr[n-1-i] = nums[n-1-i];
            } else {
                numr[n-1-i] = numr[n-i];
            }
        }
        for(int i = 0; i < n; i++) {
            if(nums[i] > numl[i] && nums[i] < numr[i]) {
                return true;
            }
        }
        return false;
    }
//    public boolean increasingTriplet(int[] nums) {
//        int ans = 0;
//        int i, j, flag;
//        int l, r, mid;
//        int n = nums.length;
//        ArrayList<Integer> vec = new ArrayList<Integer>();
//        for(i = 0; i < n; i++) {
//            // 当前链表为空， 或者比链表最后一个值要大的时候
//            if(vec.size() == 0 || nums[i] > vec.get(vec.size()-1)) {
//                vec.add(nums[i]);
//            }
//            // 二分寻找插入点
//            l = 0;
//            r = vec.size() - 1;
//            flag = 0;
//            while(l < r) {
//                mid = (l+r)/2;
//                if(vec.get(mid) > nums[i]) {
//                    r = mid-1;
//                } else if(vec.get(mid) < nums[i]) {
//                    l = mid+1;
//                } else { // 相等就不做处理
//                    flag = 1;
//                    break;
//                }
//            }
//            if(flag == 0) {
//                vec.add(l, nums[i]);
//                if(vec.size() > 1) {
//                    for(j = l+1; j < vec.size(); j++) {
//                        vec.remove(j);
//                    }
//                }
//            }
//            ans = Math.max(ans, vec.size());
//        }
//        return ans>=3;
//    }
}
