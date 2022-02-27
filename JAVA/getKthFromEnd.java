package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/27 9:21
 **/
public class getKthFromEnd {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


    /**
     * 快慢指针
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode quick = head, slow = head;
        for(int i = 0; i < k; i++) {
            quick = quick.next;
        }
        while(quick != null) {
            quick = quick.next;
            slow = slow.next;
        }
        return slow;
    }

    // /**
    // * 两次遍历
    // * @param head
    // * @param k
    // * @return
    // */
    // public ListNode getKthFromEnd(ListNode head, int k) {
    //     ListNode temp = head;
    //     int cnt = 0;
    //     while(temp != null) {
    //         temp=temp.next;
    //         cnt++;
    //     }
    //     cnt = cnt - k + 1;
    //     temp = head;
    //     while(--cnt > 0) {
    //         temp = temp.next;
    //     }
    //     return temp;
    // }
}
