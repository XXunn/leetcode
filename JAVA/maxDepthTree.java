package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/13 11:34
 **/
public class maxDepthTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    int ans = 0;
    public int maxDepth(TreeNode root) {
        dfs(root, 0);
        return ans;
    }
    void dfs(TreeNode node, int curDepth) {
        if(node == null) {
            ans = Math.max(ans, curDepth);
            return;
        }
        dfs(node.left, curDepth+1);
        dfs(node.right, curDepth+1);
    }
}
