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
    TreeNode* insertIntoBST(TreeNode* root, int val) {
        dfs(root,val);
        return root;
    }
    void dfs(TreeNode* root,int val) {
        if(root == NULL)    return;
        if(root->val > val && root->left==NULL) {
            TreeNode* temp = new TreeNode(val);
            temp->left = temp->right = NULL;
            root->left = temp;
        } 
        if(root->val < val && root->right==NULL) {
            TreeNode* temp = new TreeNode(val);
            temp->left = temp->right = NULL;
            root->right = temp;
        }

        if(root->val > val) {
            insertIntoBST(root->left,val);
        } else {
            insertIntoBST(root->right,val);
        }
    }
};

int main()
{
    
    return 0;
}
