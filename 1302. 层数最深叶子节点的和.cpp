#include<iostream>
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
    queue<TreeNode*> q;
    TreeNode* flag;
    int ans = 0;
    int tempans = 0;
    void bfs(TreeNode* root) {
        q.push(root);
        q.push(flag);
        while(q.size() > 1) {
            TreeNode* treetemp = q.front();
            q.pop();
            if(treetemp == flag) {
                tempans = 0;
                q.push(flag);
                // cout << endl << endl;
            } else {
                // cout << treetemp->val << endl;
                if(treetemp->left)  q.push(treetemp->left);
                if(treetemp->right) q.push(treetemp->right);
                tempans += treetemp->val;
                ans = tempans;
            }
        }
    }
    int deepestLeavesSum(TreeNode* root) {
        bfs(root);
        return ans;
    }
};

int main()
{

    return 0;
}