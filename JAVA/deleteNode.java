package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/11 23:05
 **/
public class deleteNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteNode(ListNode head, int val) {
        ListNode header = new ListNode(0);
        header.next = head;
        ListNode pre = header;
        while(head.val != val) {
            pre = head;
            head = head.next;
        }
        pre.next = head.next;
        return header.next;
    }
}
