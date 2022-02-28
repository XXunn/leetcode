package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/28 9:35
 **/
public class mirrorTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) {
            return root;
        }
        TreeNode left =  root.left;
        TreeNode right = root.right;
        root.left = mirrorTree(right);
        root.right = mirrorTree(left);
        return root;
    }



    // public TreeNode mirrorTree(TreeNode root) {
    //     revert(root);
    //     return root;
    // }
    // private void revert(TreeNode node) {
    //     if(node == null) return;
    //     TreeNode temp = node.left;
    //     node.left = node.right;
    //     node.right = temp;
    //     if(node.left != null)
    //     revert(node.left);
    //     if(node.right!=null)
    //     revert(node.right);
    // }
}
