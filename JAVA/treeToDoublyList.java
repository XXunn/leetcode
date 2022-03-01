package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/1 20:45
 **/
public class treeToDoublyList {
    public class Node {
        public int val;
        public Node left;
        public Node right;
        public Node() {}
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    Node head = null, cur = null;
    public Node treeToDoublyList(Node root) {
        if(root == null) {
            return head;
        }
        dfs(root);
        head.left = cur;
        cur.right = head;
        return head;
    }

    public void dfs(Node node) {
        if(node == null) {
            return;
        }
        dfs(node.left);

        if(cur != null) {
            cur.right = node;
        } else {
            head = node;
        }
        node.left = cur;
        cur = node;

        dfs(node.right);
    }

}
