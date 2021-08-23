#include <bits/stdc++.h>

using namespace std;


struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    int getLen(ListNode *head) {
        int len = 0;
        ListNode * temp = head;
        while(temp) {
            len++;
            temp = temp->next;
        }
        return len;
    }

    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode *p1 = headA, *p2 = headB;
        while(p1 != p2) {
            int f1 = 0,f2 = 0;
            if(p1 == NULL)  {p1 = headB;f1=1;}
            if(p2 == NULL)  {p2 = headA;f2=1;}
            if(!f1) p1 = p1->next;
            if(!f2) p2 = p2->next;
        }
        return p1;
    }

    // ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
    //     int lenA = getLen(headA);
    //     int lenB = getLen(headB);
    //     ListNode* ans = NULL;
    //     if(lenA > lenB) {
    //         int cnt = lenA - lenB;
    //         while(cnt--)    headA = headA->next;
    //     } else {
    //         int cnt = lenB - lenA;
    //         while(cnt--)    headB = headB->next;
    //     }
    //     while(headA && headB) {
    //         if(headA==headB) {
    //             ans = headA;
    //             return ans;
    //         }
    //         headA = headA->next;
    //         headB = headB->next;
    //     }
    //     return ans;
    // }
};

int main()
{
    
    return 0;
}
