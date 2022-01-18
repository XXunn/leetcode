#include <bits/stdc++.h>

using namespace std;


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
    int ans = 0;
    void dfs(TreeNode* root,TreeNode* pre) {
        if(root!=NULL) {
            dfs(root->left, root);
            dfs(root->right, root);
            if(root->val > 1) {
                pre->val += root->val-1;
                ans += root->val-1;
                root->val = 1;
            } else if(root->val < 1) {
                pre->val -= root->val+1;
                ans += root->val+1;
                root->val = 1;
            }
        }
        return ;
    }
    int distributeCoins(TreeNode* root) {
        dfs(root,root);
        return ans;
    }
};

int main()
{
    
    return 0;
}
