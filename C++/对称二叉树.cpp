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
    bool isSymmetric(TreeNode* root) {
        return check(root, root);
    }   
    bool check(TreeNode* treea, TreeNode* treeb) {
        if(!treea && !treeb) {
            return true;
        } else if(!treea || !treeb) {
            return false;
        }
        return treea->val == treeb->val && check(treea->left,treeb->right) && check(treea->right,treeb->left);
    }
};

int main()
{

    return 0;
}