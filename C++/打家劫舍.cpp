#include <iostream>
#include <map>
using namespace std;
class Solution {
public:
    
    struct TreeNode {
        int val;
        TreeNode *left;
        TreeNode *right;
        TreeNode(int x) : val(x), left(NULL), right(NULL) {}
    };
    map<TreeNode* ,int>f,g;
    int rob(TreeNode* root) {
        dfs(root);
        return max(f[root],g[root]);
    }
    void dfs(TreeNode* cur) {
        if(cur==NULL)  return;
        dfs(cur->left);
        dfs(cur->right);
        f[cur] = cur->val + g[cur->left] + g[cur->right];
        g[cur] = max(f[cur->left],g[cur->left]) + max(f[cur->right],g[cur->right]);
    }
};

int main()
{
    
    return 0;
}
