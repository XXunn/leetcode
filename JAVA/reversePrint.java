package leetcode;

public class reversePrint {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int[] reversePrint(ListNode head) {
        int len = 0;
        ListNode list = null;
        ListNode p = head;
        while(p != null) {
            ListNode temp = new ListNode(p.val);
            temp.next = list;
            list = temp;
            len++;
            p = p.next;
        }
        int[] ans = new int[len];
        len = 0;
        p = list;
        while(p != null) {
            ans[len++] = p.val;
            p=p.next;
        }
        return ans;
    }
}
