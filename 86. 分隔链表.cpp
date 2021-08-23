#include <bits/stdc++.h>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode* partition(ListNode* head, int x) {
        ListNode* small = new ListNode(0);
        ListNode* sp = small;
        ListNode* big = new ListNode(0);
        ListNode* bp = big;
        while(head) {
            if(head->val < x) {
                small->next =  head;
                small = small->next;
            } else {
                big->next = head;
                big = big->next;
            }
            head = head->next;
        }
        big->next = NULL;
        small->next = bp->next;
        return sp->next;
    }
};

int main()
{
    
    return 0;
}
