package leetcode;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/6/25 19:46
 **/
public class largestValues {

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


    /**
     * 这里参考官方，直接两层循环，内层循环弹出元素
     * @param root
     * @return
     */
    public List<Integer> largestValues(TreeNode root) {
        if(root == null) {
            return new LinkedList<>();
        }
        List<Integer> ans = new LinkedList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        while(!queue.isEmpty()) {
            int len = queue.size();
            int maxn = Integer.MIN_VALUE;
            while(len > 0) {
                TreeNode curNode = queue.pop();
                maxn = Math.max(maxn, curNode.val);
                len--;
                if(curNode.left != null) {
                    queue.addLast(curNode.left);
                }
                if(curNode.right != null) {
                    queue.addLast(curNode.right);
                }
            }
            ans.add(maxn);
        }
        return ans;
    }



    // /**
    //  * BFS - 每一层在后面加一个标记元素，扫到标记元素就重置，但是不是很需要这个标记元素
    //  * @param root
    //  * @return
    //  */
    // public List<Integer> largestValues(TreeNode root) {
    //     Deque<TreeNode> queue = new ArrayDeque<>();
    //     List<Integer> ans = new LinkedList<>();
    //     final TreeNode flagNode = new TreeNode();
    //     int maxn = Integer.MIN_VALUE;
    //     if(root == null) {
    //         return ans;
    //     }
    //     queue.addLast(root);
    //     queue.addLast(flagNode);
    //     while (queue.size() != 1) {
    //         TreeNode curNode = queue.pop();
    //         if(curNode == flagNode) {
    //             ans.add(maxn);
    //             maxn = Integer.MIN_VALUE;
    //             queue.addLast(flagNode);
    //             continue;
    //         }
    //         if(curNode.left != null) {
    //             queue.addLast(curNode.left);
    //         }
    //         if(curNode.right != null) {
    //             queue.addLast(curNode.right);
    //         }
    //         maxn = Math.max(maxn, curNode.val);
    //     }
    //     ans.add(maxn);
    //     return ans;
    // }


}
