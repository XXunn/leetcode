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
    vector<vector<int>> ans;
    vector<vector<int>> pathSum(TreeNode* root, int& sum) {
        vector<int> temp;
        dfs(root,0,temp,sum);
        return ans;
    }
    bool isLeaf(TreeNode* node) {
        return !node->left&&!node->right;
    }
    void dfs(TreeNode* node, int curVal, vector<int>& vec, int& sum) {
        if(node == NULL)    return;
        vec.emplace_back(node->val);
        if(sum == curVal+node->val && isLeaf(node))
            ans.emplace_back(vec);
        dfs(node->left,curVal+node->val,vec,sum);
        dfs(node->right,curVal+node->val,vec,sum);
        return;
    }
};

int main()
{
    
    return 0;
}
