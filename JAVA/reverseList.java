package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 8:57
 **/
public class reverseList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    // A -> B -> C
    // reverseList(A) : A A.next
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    // public ListNode reverseList(ListNode head) {
    //     ListNode pre = null, cur = head;
    //     ListNode temp = null;
    //     while (cur != null) {
    //         temp = cur;
    //         cur.next = pre;
    //         pre = cur;
    //         cur = temp.next;
    //     }
    //     return pre;
    // }
    // public ListNode reverseList(ListNode head) {
    //     ListNode list = null;
    //     while(head != null) {
    //         ListNode temp = head;
    //         head = head.next;
    //         temp.next = list;
    //         list = temp;
    //     }
    //     return list;
    // }
}
