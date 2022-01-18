package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class permute {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        List<Integer> temp = new LinkedList<Integer>();
        for(int num : nums) {
            temp.add(num);
        }
        dfs(0, nums.length, ans, temp);
        return ans;
    }
    static void dfs(int first, int n, List<List<Integer>> ans, List<Integer> temp) {
        if(first == n) {
            // System.out.println(temp);
            ans.add(new LinkedList<Integer>(temp));
            System.out.println(ans);
            return;
        } else {
            for(int i = first; i < n; i++) {
                Collections.swap(temp, first, i);
                dfs(first+1, n, ans, temp);
                Collections.swap(temp, first, i);
            }
        }
    }

    public static void main(String[] args) {
//        List<List<Integer>> ans = permute(new int[]{1, 2, 3});
//        for(List<Integer> a : ans) {
//            System.out.println(a);
//        }
        List<List<Integer>> l = new LinkedList<List<Integer>>();
        List<Integer> sub = new LinkedList<Integer>();
        sub.add(1);
        sub.add(2);
        l.add(sub);
        sub.add(3);
        l.add(sub);
        sub.add(4);
        System.out.println(l);
    }

//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//        List<Integer> temp = new ArrayList<Integer>();
//        for(int num : nums) {
//            temp.add(num);
//        }
//        dfs(0, nums.length, ans, temp);
//        return ans;
//    }
//    void dfs(int first, int n, List<List<Integer>> ans, List<Integer> temp) {
//        if(first == n) {
//            ans.add(new ArrayList<Integer>(temp));
//            return;
//        } else {
//            for(int i = first; i < n; i++) {
//                Collections.swap(temp, first, i);
//                dfs(first+1, n, ans, temp);
//                Collections.swap(temp, first, i);
//            }
//        }
//    }
}
