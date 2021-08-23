#include<iostream>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    int flag = 0;
    bool hasPathSum(TreeNode* root, int sum) {
        dfs(root, sum);
        return flag ==1;
    }
    void dfs(TreeNode* node, int sum) {
        if(sum == 0 && node->left==NULL && node->right==NULL) {
            flag = 1;
            return;
        }   
        if(node == NULL)    return;
        if(node->left)  dfs(node->left,sum-node->val);
        if(node->right)  dfs(node->right,sum-node->val);
    }
};

int main()
{

    return 0;
}