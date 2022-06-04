package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/6/4 22:16
 **/
public class getDirections {
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

        // 存放两个路径
        List<String> list = new ArrayList<String>();

        public String getDirections(TreeNode root, int startValue, int destValue) {
            dfs(new StringBuilder(), root, startValue);
            dfs(new StringBuilder(), root, destValue);
            String rootToStart = list.get(0);
            String rootToDest = list.get(1);
            int minL = Math.min(rootToStart.length(), rootToDest.length());
            int idx;
            String Res = "";
            // 如果有公共前缀可以直接忽略
            for(idx = 0; idx < minL; idx++) {
                if(rootToStart.charAt(idx) != rootToDest.charAt(idx)) {
                    break;
                }
            }
            // 从开始的那个节点一直往上走到最近父节点
            if(idx < rootToStart.length()) {
                for(int i = 0; i < rootToStart.length() - idx; i++) {
                    Res += "U";
                }
            }
            // 从最近的父节点往目标节点走即可
            if(idx < rootToDest.length()) {
                Res += rootToDest.substring(idx, rootToDest.length());
            }
            return Res;
        }

        // 获取从root到所对应点的路径
        void dfs(StringBuilder strBuilder, TreeNode node, int nodeValue) {
            if(node.val == nodeValue) {
                list.add(strBuilder.toString());
                return ;
            }
            if(node.left != null) {
                strBuilder.append("L");
                dfs(strBuilder, node.left, nodeValue);
                strBuilder.deleteCharAt(strBuilder.length()-1);
            }
            if(node.right != null) {
                strBuilder.append("R");
                dfs(strBuilder, node.right, nodeValue);
                strBuilder.deleteCharAt(strBuilder.length()-1);
            }
            return ;
        }

}
