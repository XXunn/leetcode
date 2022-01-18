#include <iostream>
#include <queue>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    int sum[1000] = {0};int maxStep = 0;
    void order(TreeNode* node,int step) {
        if(node) {
            order(node->left,step+1);
            sum[step] += node->val; maxStep = max(maxStep,step);
            order(node->right,step+1);
        }
    }
    int maxLevelSum(TreeNode* root) {
        order(root,1);
        int maxLevel = 1;int maxn = root->val;
        for(int i = 1;i <= maxStep;i++) {
            if(sum[i]>maxn) {
                maxn = sum[i];
                maxLevel = i;
            }
        }
        return maxLevel;
    }
};

// class Solution {
// public:
//     int maxLevelSum(TreeNode* root) {
//         queue<TreeNode*> q;
//         int maxSum = root->val,curSum = 0;
//         int maxLevel = 1,curLevel = 1;
//         TreeNode *temp = root,*flag=NULL;
//         q.push(root);q.push(flag);
//         while(q.size()>1) {
//             temp = q.front();
//             cout << "temp:" << temp << endl;
//             cout << "flag:" << flag << endl;
//             q.pop();
//             if(temp!=flag) {
//                 curSum += temp->val;
//                 if(temp->left!=NULL)  q.push(temp->left);
//                 if(temp->right!=NULL) q.push(temp->right);
//             } else {
//                 if(curSum>maxSum) {
//                     maxSum = curSum;
//                     maxLevel = curLevel;
//                 }
//                 curSum = 0;
//                 q.push(flag);
//                 curLevel++; 
//             }
//         }
//         return maxLevel;
//     }
// };

int main()
{
    TreeNode t1(1);
    TreeNode t2(7);
    TreeNode t3(0);
    TreeNode t4(7);
    TreeNode t5(-8);
    t1.left = &t2;
    t1.right = &t3;
    t2.left = &t4;
    t2.right = &t5;
    Solution slt;
    cout << slt.maxLevelSum(&t1) << endl;;
    //cout << t1.left->val << endl;
    return 0;
}
