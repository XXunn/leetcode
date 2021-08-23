#include <bits/stdc++.h>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    TreeNode* mergeTrees(TreeNode* t1, TreeNode* t2) {
        if(t1 == NULL)  return t2;
        if(t2 == NULL)  return t1;
        auto node = TreeNode(t1->val+t2->val);
        node->left = mergeTrees(t1->left,t2->left);
        node->right = mergeTrees(t1->right,t2->right);
        return node;
    }
};

int main()
{
    
    return 0;
}
