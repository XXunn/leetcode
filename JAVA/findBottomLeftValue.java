package leetcode;


import java.awt.*;

public class findBottomLeftValue {
    int ans = 0, depth = 0;
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    void dfs(TreeNode node, int curDepth) {
        if(node == null) {
            return;
        }
        if(node.left != null && node.right != null) {
            if(curDepth > depth) {
                ans = node.val;
                depth = curDepth;
            }
        }
        dfs(node.left, curDepth+1);
        dfs(node.right, curDepth+1);
    }

}
