package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/1 18:12
 **/
public class pathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    List<List<Integer>> ans = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if(root == null) {
            return ans;
        }
        List<Integer> list = new LinkedList<>();
        dfs(root, list, 0, target);
        return ans;
    }
    private void dfs(TreeNode node, List<Integer> curList, int sum, int target) {
        curList.add(node.val);
        // for (Integer temp : curList) {
        //     System.out.print(temp + " ");
        // }
        sum += node.val;
        // System.out.print("sum: " + sum);
        // System.out.println();
        if(node.left == null && node.right == null && sum == target) {
            ans.add(new LinkedList<>(curList));
        }
        if(node.left != null) {
            dfs(node.left, curList, sum, target);
        }
        if(node.right != null) {
            dfs(node.right, curList, sum, target);
        }
        curList.remove(curList.size()-1);
        sum -= node.val;
    }
}
