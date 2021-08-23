#include <iostream>

using namespace std;
struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution {
public:
    TreeNode* sortedListToBST(ListNode* head) {
        if(head == nullptr)    return NULL;
        if(head->next == nullptr)   return new TreeNode(head->val);
        ListNode *fast = head,*slow = head,*pre = NULL;
        while(fast != NULL && fast->next != NULL) {
            pre = slow;
            slow=slow->next;
            fast=fast->next->next;
        }
        pre->next = NULL;   //切割链表
        TreeNode *root = new TreeNode(slow->val);
        root->left = sortedListToBST(head);
        root->right = sortedListToBST(slow->next);
        return root;
    }
};

// class Solution {
// public:
//     ListNode* getMid(ListNode* left,ListNode* right) {
//         //快慢指针法找中间的指针
//         ListNode* fast = left;
//         ListNode* slow = left;
//         while(fast != right && fast->next!=right) {
//             fast = fast->next->next;
//             slow = slow->next;
//         }
//         return slow;
//     }
//     TreeNode* buildTree(ListNode* left,ListNode* right) {
//         if(left==right) return NULL;
//         ListNode* mid = getMid(left,right);
//         TreeNode* root = new TreeNode(mid->val);
//         root->left = buildTree(left,mid);
//         root->right = buildTree(mid->next,right);
//         return root;
//     }
//     TreeNode* sortedListToBST(ListNode* head) {
//         ListNode* temp = head;
//         while(temp->next!=NULL) {
//             temp = temp->next;
//         }
//         return buildTree(head,temp);
//     }
// };

int main()
{
    
    return 0;
}
