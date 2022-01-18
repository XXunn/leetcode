#include <iostream>
#include <vector>
#include <cstring>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    TreeNode* getTree(int l,int r,vector<int>& nums) {
        if(l>r) return nullptr;
        int mid = (l+r)/2;
        TreeNode *temp = new TreeNode(nums[mid]);
        temp->left = getTree(l,mid-1,nums);
        temp->right = getTree(mid+1,r,nums);
        return temp;
    }
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        return getTree(0,nums.size()-1,nums);
    }
};

int main()
{
    
    return 0;
}
