#include <iostream>
#include <string>
#include <vector>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    vector<string> ans;
    vector<string> binaryTreePaths(TreeNode* root) {
        string s = "";
        dfs(root,s);
        return ans;
    }
    string dfs(TreeNode* node,string& s) {
        if(node==NULL)  return;
        if(node->left==NULL && node->right==NULL) {
            s += to_string(node->val);
            ans.emplace_back(s);
            return s;
        }
        s += to_string(node->val);
        s += "->";
        if(node->left)  dfs(node->left,s);
        if(node->right) dfs(node->right,s);
    }
};

int main()
{
    
    return 0;
}
