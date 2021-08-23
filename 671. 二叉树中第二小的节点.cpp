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

class Solution2 {
public:
    int findSecondMinimumValue(TreeNode* root) {
        int ans = -1;
        int rootvalue = root->val;

        function<void(TreeNode*)> dfs = [&](TreeNode* node) {
            // function<_Res(_ArgTypes...)>
            // 是pass by value，相当于[addr, time]，如果不想修改值，就用这个
            // &是pass by reference，相当于[&addr, &time]，如果需要修改值，就用这个
            if (!node) {
                return;
            }
            if (ans != -1 && node->val >= ans) {
                return;
            }
            if (node->val > rootvalue) {
                ans = node->val;
            }
            dfs(node->left);
            dfs(node->right);
        };

        dfs(root);
        return ans;
    }
};

class Solution {
public:
    int findSecondMinimumValue(TreeNode* root) {
        int ans = root->val;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()) {
            TreeNode* node = q.front();
            q.pop();
            if(node->left)  q.push(node->left);
            if(node->right) q.push(node->right);
            if(ans == root->val) {
                ans = max(ans, node->val);
            } else {
                if(node->val > root->val) ans = min(node->val, ans);
            }
        }
        return ans==root->val?-1:ans;
    }
};

int main()
{
    
    return 0;
}
