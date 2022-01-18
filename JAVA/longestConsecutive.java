package leetcode;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutive {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums) {
            set.add(num);
        }
        int maxL = 0;
        for(int num : set) {
            if(set.contains(num-1)) {
                continue;
            }
            int curNum = num, curL = 1;
            while(set.contains(curNum+1)) {
                curNum++;
                curL++;
            }
            maxL = Math.max(maxL, curL);
        }
        return maxL;
    }

    public static void main(String[] args) {
        int []a = {1,5,4,2,6};
        longestConsecutive(a);
    }
}
