package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/12 21:39
 **/
public class postorder {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    List<Integer> ans = new LinkedList<>();
    public List<Integer> postorder(Node root) {
        dfs(root);
        return ans;
    }

    public void dfs(Node node) {
        if(node == null) {
            return;
        }
        for(Node x : node.children) {
            dfs(x);
        }
        ans.add(node.val);
    }
}
