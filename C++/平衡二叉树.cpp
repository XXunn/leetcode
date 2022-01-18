#include <iostream>

using namespace std;

struct TreeNode {
     int val;
     TreeNode *left;
     TreeNode *right;
     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 };
class Solution {
public:
    bool isBalanced(TreeNode* root) {
        return getdepth(root) >= 0;
    }
    int getdepth(TreeNode* node) {
        if(node == NULL)    return 0;
        int leftheight = getdepth(node->left);
        int rightheight = getdepth(node->right);
        if(leftheight == -1 || rightheight == -1 || abs(leftheight-rightheight) > 1) {
            return -1;
        }
        return max(leftheight,rightheight)+1;
    }
};
// class Solution {
// public:
//     bool isBalanced(TreeNode* root) {
//         if(root == NULL)    return true;
//         return (abs(getdepth(root->left)-getdepth(root->right))<=1 && isBalanced(root->left) && isBalanced(root->right));
//     }
//     int getdepth(TreeNode* node) {
//         if(node == NULL)    return 0;
//         return max(getdepth(node->left),getdepth(node->right)) + 1;
//     }
// };

int main()
{
    
    return 0;
}
