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
    struct Node {
        int x, y, val;
        Node() {}
        Node(int a, int b, int c) : x(a), y(b), val(c) {}
        bool operator < (Node node) const {
            if(y != node.y) return node.y < y;
            else if(x != node.x) return node.x < x;
            return node.val < val;
        }
    };
    map<int, priority_queue<Node>> mp;
    vector<vector<int>> ans;

    void dfs(int x, int y, TreeNode* node) {
        if(!node)   return ;
        mp[y].push({x,y,node->val});
        dfs(x+1, y-1, node->left);
        dfs(x+1, y+1, node->right);
        return ;
    }

    vector<vector<int>> verticalTraversal(TreeNode* root) {
        if(!root)   return ans;
        dfs(0, 0, root);
        for(auto &[x,y] : mp) {
            ans.emplace_back(vector<int>());
            while(!y.empty()) {
                ans.back().emplace_back(y.top().val);
                y.pop();
            }
        }
        return ans;
    }
};


int main()
{
    
    return 0;
}
