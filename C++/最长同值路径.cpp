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
    int ans = 0;
    int longestUnivaluePath(TreeNode* root) {
        
    }
    int dfs(TreeNode* node) {
        if(node == NULL)    return 0;
        int maxn = 0;
        int left = dfs(node->left);
        int right = dfs(node->right);
        if(node->left && node->right && node->val == node->left->val && node->val == node->right->val) {
            ans = max(ans,left+right+2);
        }
        if(node->left && node->left->val == node->val) {
            maxn = left + 1;
        }
        if(node->right && node->right->val == node->val) {
            maxn = right + 1;
        }
        ans = max(ans,maxn);
        return maxn;
    }
    
};

int main()
{
    
    return 0;
}
