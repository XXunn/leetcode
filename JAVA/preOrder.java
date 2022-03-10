package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/10 10:05
 **/
public class preOrder {
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
    public List<Integer> preorder(Node root) {
        dfsPre(root);
        return ans;
    }
    public void dfsPre(Node root) {
        if(root == null) {
            return;
        }
        ans.add(root.val);
        for(Node chuid : root.children) {
            dfsPre(chuid);
        }
    }

}
