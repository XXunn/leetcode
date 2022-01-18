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
    int sumNumbers(TreeNode* root) {
        dfs(root,0);
        return ans;
    }
    void dfs(TreeNode* node, int val) {
        if(node->left==nullptr && node->right==nullptr) {
            ans += (10*val+node->val);
            return;
        }
        if(node->left)  dfs(node->left,val+node->val);
        if(node->right) dfs(node->right,val+node->val);
        return;
    }
};

int main()
{
    
    return 0;
}
