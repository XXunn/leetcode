#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    vector<vector<int>>ans;
    int cnt = 0;
    vector<vector<int>> levelOrderBottom(TreeNode* root) {
        if(root == NULL)    return ans;
        bfs(root);
        reverse(ans.begin(),ans.end());
        return ans;
    }
    void bfs(TreeNode* root) {
        vector<int> value;
        TreeNode* flag;
        TreeNode* temp;
        queue<TreeNode*>q;
        q.emplace(root);
        q.emplace(flag);
        while(!q.empty()&&q.size()>1) {
            temp = q.front();
            q.pop();
            if(temp==flag) {
                ans.push_back(value);
                value.clear();
                cnt++;
                q.emplace(temp);
            } else {
                value.emplace_back(temp->val);
                if(temp->left!=NULL)  q.emplace(temp->left);
                if(temp->right!=NULL) q.emplace(temp->right);
            }
        }
        ans.push_back(value);
    }
};

int main()
{
    
    return 0;
}
