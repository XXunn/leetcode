package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/1 9:31
 **/
public class levelOrderByZ {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) {
            return ans;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        int dir = 1;
        deque.addFirst(root);
        while (!deque.isEmpty()) {
            List<Integer> tempList = new LinkedList<>();
            if(dir == 1) {
                for(int i = deque.size()-1; i >= 0; i--) {
                    TreeNode temp = deque.pollFirst();
                    tempList.add(temp.val);
                    if(temp.left != null) {
                        deque.addLast(temp.left);
                    }
                    if(temp.right != null) {
                        deque.addLast(temp.right);
                    }
                }
                ans.add(tempList);
                dir = 0;
            } else {
                for(int i = deque.size()-1; i >= 0; i--) {
                    TreeNode temp = deque.pollLast();
                    tempList.add(temp.val);
                    if(temp.right != null) {
                        deque.addFirst(temp.right);
                    }
                    if(temp.left != null) {
                        deque.addFirst(temp.left);
                    }
                }
                ans.add(tempList);
                dir = 1;
            }
        }
        return ans;
    }
}
