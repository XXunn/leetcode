#include <bits/stdc++.h>

using namespace std;


class Node {
public:
    int val;
    Node* left;
    Node* right;
    Node* next;

    Node() : val(0), left(NULL), right(NULL), next(NULL) {}

    Node(int _val) : val(_val), left(NULL), right(NULL), next(NULL) {}

    Node(int _val, Node* _left, Node* _right, Node* _next)
        : val(_val), left(_left), right(_right), next(_next) {}
};

class Solution {
public:
    Node* connect(Node* root) {
        if(root == NULL)    return root;
        Node* theleft = root;
        Node* head;
        while(theleft->next != NULL) {
            head = theleft;
            while(head != NULL) {
                head->left = head->right;
                if(head->next != NULL) {
                    head->right->next = head->next->left;
                }
                head = head->next;
            }
            theleft = theleft->left;
        }
        return root;
    }
};


// class Solution {
// public:
//     Node* connect(Node* root) {
//         Node* theleft = root;
//         Node* head;
//         if(!root)   return root;
//         root->next = NULL;
//         if(root->left)
//             root->left->next = root->right;
//         while(theleft -> left != NULL) {
//             theleft = theleft -> left;
//             if(theleft -> next != NULL) {
//                 head = theleft;
//             if(head->left==NULL)    break;
//                 while(head != NULL) {
//                     head->left->next = head->right;
//                     if(head->next) {
//                         head->right->next = head->next->left;
//                         //head = head->next;
//                     }
//                     head = head->next;
//                 }
//             }
//         }
//         return root;
//     }
// };



// class Solution {
// public:
//     queue<Node*> que;
//     Node* flag = 0;
//     Node* pre;
//     Node* connect(Node* root) {
//         que.push(root);
//         que.push(flag);
//         while(que.size() > 1) {
//             Node* temp = que.front();
//             que.pop();
//             if(temp->left && temp->right) {
//                 que.push(temp->left);
//                 que.push(temp->right);
//             }
//             if(que.front() != flag) {
//                 temp->next = que.front();
//             } else {
//                 temp->next = NULL;
//                 que.pop();
//                 que.push(flag);
//             }
//         }
//         return root;
//     }
// };


int main()
{
    
    return 0;
}
