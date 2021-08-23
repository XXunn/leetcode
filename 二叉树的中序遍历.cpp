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
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> result;
        stack<pair<TreeNode*, int> > stk;
        stk.push((make_pair(root, 0)));
        
        while(!stk.empty()) {
            auto [node, type] = stk.top();
            stk.pop();
            if(node == nullptr) continue;
            if(type == 0) {
                stk.push(make_pair(node->right, 0));
                stk.push(make_pair(node, 1));
                stk.push(make_pair(node->left, 0));
            }
            else result.emplace_back(node->val);
        }
        return result;
    }
    // vector<int> ans; 
    // vector<int> inorderTraversal(TreeNode* root) {
    //     midTree(root);
    //     return ans;
    // }
    // void midTree(TreeNode* node) {
    //     if(node==NULL)  return;
    //     midTree(node->left);
    //     ans.emplace_back(node->val);
    //     midTree(node->right);
    // }
};

int main()
{
    
    return 0;
}
