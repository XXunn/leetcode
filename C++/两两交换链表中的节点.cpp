#include <bits/stdc++.h>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        if (head == nullptr || head->next == nullptr) {
            return head;
        }
        ListNode* newHead = head->next;
        head->next = swapPairs(newHead->next);
        newHead->next = head;
        return newHead;
    }
};

// class Solution {
// public:
//     ListNode* swapPairs(ListNode* head) {
//         if(head == NULL || head->next == NULL)    return head;
//         ListNode* temp = head->next;
//         ListNode* temp2;
//         ListNode* pre;
//         head->next = temp->next;
//         temp->next = head;
//         pre = head;
//         ListNode* p = head->next;
//         while(p != NULL && p->next) {
//             // cout << p->val << endl;
//             temp2 = p->next;
//             pre->next = temp2;
//             // cout << temp2->val << endl;
//             p->next = temp2->next;
//             temp2->next = p;
//             pre = p;
//             p = p->next;
//         }
//         return temp;
//     }
// };


int main()
{
    
    return 0;
}
