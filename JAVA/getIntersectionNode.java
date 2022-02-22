package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/22 16:48
 **/
public class getIntersectionNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    // 双指针一直走就可以了
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null && headB == null) {
            return null;
        }
        ListNode x = headA;
        ListNode y = headB;
        while(x != y) {
            x = (x.next == null ? headB : x.next);
            y = (y.next == null ? headA : y.next);
        }
        return x;
    }
}
