package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/1 17:50
 **/
public class verifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        return judge(postorder, 0, postorder.length-1);
    }
    private boolean judge(int[] postorder, int left, int right) {
        // 左边大于右边说明判断完毕，可以正确
        if(left >= right) {
            return true;
        }
        // 根为最右边的
        int root = postorder[right];
        int index = left;
        // 找到第一个比根大的
        while(index < right && postorder[index] < root) {
            index++;
        }
        // 看右子树中的节点是否都大于根
        for(int i = index; i < right; i++) {
            if(postorder[i] < root) {
                return false;
            }
        }
        // 找左子树
        if(!judge(postorder, left, index-1)) {
            return false;
        }
        // 找右子树
        if(!judge(postorder, index, right-1)) {
            return false;
        }
        return true;
    }
}
