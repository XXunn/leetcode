package leetcode;

import java.util.ArrayList;
import java.util.Random;

public class linkedListRandomNode  {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // 蓄水池抽样
    ListNode head;
    Random random;

    public linkedListRandomNode(ListNode head) {
        this.head = head;
        random = new Random();
    }

    public int getRandom() {
        int cnt = 1, ans = 0;
        for(ListNode node = head; node != null ; node = node.next) {
            if(random.nextInt(cnt) == 0) {
                ans = node.val;
            }
            ++cnt;
        }
        return ans;
    }

//    ArrayList<Integer> array = new ArrayList<Integer>();
//
//     public class ListNode {
//         int val;
//         ListNode next;
//         ListNode() {}
//         ListNode(int val) { this.val = val; }
//         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     }
//
//
//    public linkedListRandomNode(ListNode head) {
//        ListNode temp = head;
//        while(temp != null) {
//            array.add(temp.val);
//            temp = temp.next;
//        }
//    }
//
//    public int getRandom() {
//        Random random = new Random();
//        return array.get(random.nextInt(array.size()));
//    }
}
