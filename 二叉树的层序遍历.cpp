#include<iostream>
#include<vector>
#include<queue>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> ans;
        if(root == NULL)    return ans;
        vector<int> temp_ans;
        TreeNode* flag = NULL;
        queue<TreeNode*> que;
        que.push(root);
        que.push(flag);
        while(que.size() > 1) {
            TreeNode* temp = que.front();
            que.pop();
            if(temp == flag) {
                ans.emplace_back(temp_ans);
                temp_ans.clear();
                que.push(flag);
            } else {
                temp_ans.emplace_back(temp->val);
                if(temp->left != NULL)  que.push(temp->left);
                if(temp->right != NULL) que.push(temp->right);
            }
        }
        return ans;
    }
};

int main()
{

    return 0;
}