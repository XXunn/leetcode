package leetcode;

import java.util.ArrayList;
import java.util.Random;

public class addTwoNnumbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.get(random.nextInt(array.size()));


        ListNode head = null, tail = null;
        int f = 0;
        while(l1 != null || l2 != null) {
            int val1 = l1==null?0:l1.val;
            int val2 = l2==null?0:l2.val;
            int sum = val1 + val2 + f;
            if(head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            f = sum / 10;
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        if(f > 0) {
            tail.next = new ListNode(1);
        }
        return head;
    }
}
