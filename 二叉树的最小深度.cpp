#include <iostream>
#include <queue>
using namespace std;
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    int minDepth(TreeNode* root) {
        if(root==NULL)  return 0;
        int deep = 1;
        queue<TreeNode*>q;
        TreeNode *flag = NULL;
        TreeNode *temp;
        q.push(root);
        q.push(flag);
        while(q.size() > 1) {
            temp = q.front();
            q.pop();
            if (temp!=flag) {
                if(temp->left==NULL && temp->right==NULL)   return deep;
                if(temp->left)  q.push(temp->left);
                if(temp->right) q.push(temp->right);
            } else {
                deep++;
                q.push(flag);
            }
        }
        return deep;
    }
};

int main()
{
    
    return 0;
}
