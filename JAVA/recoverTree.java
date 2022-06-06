package leetcode;

import javafx.util.Pair;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/6/6 18:49
 **/
public class recoverTree {

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



    // 考虑直接用中序遍历找出不同的即可
    public void recoverTree(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode pre = null, x = null, y = null;
        if(root == null) {
            return;
        }
        while(!stack.isEmpty() || root!=null) {
            while(root!=null) {
                stack.push(root);
                root=root.left;
            }
            root = stack.pop();
            if(pre != null && root.val < pre.val) {
                y = root;
                if(x == null) {
                    x = pre;
                } else {
                    break;
                }
            }
            pre = root;
            root = root.right;
        }
        x.val += y.val;
        y.val = x.val - y.val;
        x.val -= y.val;
    }

    /** 这里用递归实现不了，所以用模拟栈试试
    void dfs(TreeNode node) {
        if (node.left != null) {
            dfs(node.left);
        }
        cnt = cnt + 1;
        // System.out.println(cnt + " " + node.val);
        if (cnt != node.val) {
            list.add(node);
        }
        if (node.right != null) {
            dfs(node.right);
        }
    }
    */

}