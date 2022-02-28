package leetcode;

import java.util.*;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/28 10:24
 **/
public class levelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root != null) {
            queue.add(root);
        }
        while(!queue.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            // 注意这里不能写成 i = 0； i++ 因为queue的size会改变
            for(int i = queue.size(); i > 0; i--) {
                TreeNode tempNode = queue.poll();
                tempList.add(tempNode.val);
                if(tempNode.left != null) {
                    queue.add(tempNode.left);
                }
                if(tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }
            ans.add(tempList);
        }
        return ans;
    }
}
