package leetcode;

import java.util.ArrayList;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/13 9:53
 **/
public class kthLargest {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    ArrayList<Integer> list = new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        dfs(root);
        // list.forEach(System.out::println);
        return list.get(list.size() - k);
    }

    private void dfs(TreeNode node) {
        if(node == null) {
            return;
        }
        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }
}
