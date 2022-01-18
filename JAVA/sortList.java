package leetcode;

public class sortList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode sortList(ListNode head) {
        ListNode p1 = head;
        ListNode p2;
        for(; p1 != null; p1=p1.next) {
            for(p2 = p1.next; p2 != null; p2=p2.next) {
                if(p1.val > p2.val) {
                    int temp = p1.val;
                    p1.val = p2.val;
                    p2.val = temp;
                }
            }
        }
        return head;
    }
}
