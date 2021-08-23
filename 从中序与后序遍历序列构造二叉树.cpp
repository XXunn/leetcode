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
    int rootIndex;
    unordered_map<int, int> mp;
    int n;  
    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
        n = inorder.size();
        rootIndex = n - 1;
        for(int i = 0;i < n;i++)    // HASH
            mp[inorder[i]] = i;
        return buildTree(0,n-1,inorder,postorder);
    }
    TreeNode* buildTree(int l, int r,vector<int>& inorder, vector<int>& postorder) {
        if(l > r)   return NULL;
        TreeNode* root = new TreeNode(postorder[rootIndex]);
        int midIndex = mp[postorder[rootIndex]];
        --rootIndex;    //前移
        root->right = buildTree(midIndex+1,r,inorder,postorder);
        root->left = buildTree(l,midIndex-1,inorder,postorder);
        return root;
    }
};
 
int main()
{
    
    return 0;
}
